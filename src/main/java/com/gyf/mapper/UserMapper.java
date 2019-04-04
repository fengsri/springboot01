package com.gyf.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int save(String username,String password);
}
