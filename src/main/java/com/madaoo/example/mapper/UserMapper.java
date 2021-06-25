package com.madaoo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.madaoo.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
