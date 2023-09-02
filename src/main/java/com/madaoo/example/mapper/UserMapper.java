package com.madaoo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.madaoo.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select(" select * from user u left join test t on u.id = t.id where u.gender =false and u.age  = 62")
    List<User> joinTable();
}
