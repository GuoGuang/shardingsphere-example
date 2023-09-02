package com.madaoo.example.config;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

public class PreciseModuloTableShardingAlgorithm implements ComplexKeysShardingAlgorithm {

    /**
     * age、gender必须有值
     * @param collection available data sources or tables's names
     * @param complexKeysShardingValue sharding value
     * @return
     */
    @Override
    public Collection<String> doSharding(Collection collection, ComplexKeysShardingValue complexKeysShardingValue) {

        Map<String, Collection<String>> valuesMap = complexKeysShardingValue.getColumnNameAndShardingValuesMap();
        Optional<String> gender = Optional.ofNullable(valuesMap.get("gender")).orElse(new ArrayList<>()).stream().findFirst();
        Integer age = Integer.valueOf(String.valueOf(valuesMap.get("age").stream().findFirst().get()));
        StringBuilder tableName = new StringBuilder("user");
        //被2整除的的走user_1表，否则走，其他逻辑类似
         boolean ageResult =(age % 2) == 0;
        tableName.append(ageResult ? "_1" : "_0");
        if (ageResult && gender.isPresent()) {
            // 二次分表，在user_1表的基础
            tableName.append((Boolean.parseBoolean(String.valueOf(gender.get()))? "_man" : "_woman"));
        }
        ArrayList<String> table = new ArrayList<>();
        table.add(tableName.toString());
        return table;
    }

}
