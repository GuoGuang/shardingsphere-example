package com.madaoo.example.config;

import com.google.common.collect.Range;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.*;

public class PreciseModuloTableShardingAlgorithm implements PreciseShardingAlgorithm<Date> , RangeShardingAlgorithm<Date> , ComplexKeysShardingAlgorithm {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        //对于库的分片collection存放的是所有的库的列表，这里代表flow_01~flow_12
        //配置的分片的sharding-column对应的值
        Date timeValue = preciseShardingValue.getValue();
        //分库时配置的sharding-column
        String time = preciseShardingValue.getColumnName();
        //需要分库的逻辑表
        String table = preciseShardingValue.getLogicTableName();
        if(timeValue == null){
            throw new UnsupportedOperationException("preciseShardingValue is null");
        }
        //按月路由
        for (String each : collection) {
            Calendar ca = Calendar.getInstance();
            ca.setTime(timeValue);
            int month = ca.get(Calendar.MONTH);
            if(each.equals(String.valueOf(table + month))){
                //这里返回回去的就是最终需要查询的表名
                return each;
            }
        }
        return null;
    }


    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Date> rangeShardingValue) {
        Range<Date> timeValues = rangeShardingValue.getValueRange();
        //分库时配置的sharding-column
        String time = rangeShardingValue.getColumnName();
        //需要分库的逻辑表
        String table = rangeShardingValue.getLogicTableName();
        if(timeValues == null){
            throw new UnsupportedOperationException("preciseShardingValue is null");
        }
        //按月路由
        Date upperDate = timeValues.upperEndpoint();
        Date lowerDate = timeValues.lowerEndpoint();
        Calendar ca = Calendar.getInstance();
        ca.setTime(lowerDate);
        int lowerMonth = ca.get(Calendar.MONTH);
        ca.setTime(upperDate);
        int upperMonth = ca.get(Calendar.MONTH);
        List<String> tables = new ArrayList<>();
        for(int i = lowerMonth ; i < 11 ; i ++) {
            if(i > upperMonth){
                break;
            }
            tables.add(table + i);
        }
        return tables;
    }


    @Override
    public Collection<String> doSharding(Collection collection, ComplexKeysShardingValue complexKeysShardingValue) {
        Map<String,Collection> map = complexKeysShardingValue.getColumnNameAndShardingValuesMap();



        return null;
    }
}
