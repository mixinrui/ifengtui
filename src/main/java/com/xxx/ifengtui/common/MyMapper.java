package com.xxx.ifengtui.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface MyMapper<T> extends MySqlMapper<T>, Mapper<T> ,InsertListMapper<T> {
}


