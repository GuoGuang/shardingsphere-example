package com.madaoo.example.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * 自定义分库策略
 */
public class DBShardingAlgorithm implements PreciseShardingAlgorithm<String> {

		private static final String DB_NAME_PREFIX = "tenant_";

		@Override
		public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<String> shardingValue) {
			String targetTable = DB_NAME_PREFIX + shardingValue.getValue();
			if (availableTargetNames.contains(targetTable)){
				return targetTable;
			}
			throw new UnsupportedOperationException("不存在的数据库: " + DB_NAME_PREFIX + shardingValue.getValue());
		}
}
