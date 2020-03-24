package com.example.mapper;

import com.example.entity.Orders;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author: czh;
 * @date: 2020/3/23;
 * @description: ;
 */
@Component
public interface OrdersMapper extends Mapper<Orders>, MySqlMapper<Orders> {

}
