package com.example.tk;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author: czh;
 * @date: 2020/3/9;
 * @description: ;
 */
@Repository
public interface MyBaseMapper<T>  extends Mapper<T>, MySqlMapper<T>, ExampleMapper<T> {
}
