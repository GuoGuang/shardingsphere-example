package com.madaoo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.madaoo.example.pojo.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper extends BaseMapper<Test> {
}
