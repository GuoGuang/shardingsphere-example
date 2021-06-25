package com.madaoo.example.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class DBShardingAlgorithm implements PreciseShardingAlgorithm<String> {

    private static final String DB_NAME = "test_db_";

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        String text = preciseShardingValue.getValue();
        switch (text){
            case "text1":
                return "m1";
            case "text2":
                return "m2";
            default:
                return "m2";
        }
    }
}
