package com.example;

import com.example.entity.Area;
import com.example.entity.Orders;
import com.example.entity.User;
import com.example.mapper.AreaMapper;
import com.example.mapper.OrdersMapper;
import com.example.mapper.UserMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnMybatisApplicationTests {

    @Autowired
    AreaMapper areaMapper;
    @Autowired
    OrdersMapper ordersMapper;

    @Test
    public void contextLoads(){
        int insert = areaMapper.insert(new Area("122", "北京", "123", "zs", "1"));
        System.out.println(insert);
    }


    /**
     * 保存一个实体，null的属性不会保存，会使用数据库默认值。
     */
    @Test
    public void insertSelective(){
        Orders orders = new Orders();
        orders.setOrderNo(UUID.randomUUID().toString());
        orders.setOrderAmt(new BigDecimal(8.00));
        ordersMapper.insertSelective(orders);
        System.out.println(orders);
    }

    /**
     * 保存一个实体，null的属性也会保存，不会使用数据库默认值
     */
    @Test
    public void insertOrders(){
        Orders orders = new Orders();
        orders.setOrderNo(UUID.randomUUID().toString());
        ordersMapper.insert(orders);
        System.out.println(orders);
    }

    @Test
    public void insertList(){
        Orders orders1 = new Orders();
        orders1.setOrderNo(UUID.randomUUID().toString());
        orders1.setOrderAmt(new BigDecimal(7.00));
        Orders orders2 = new Orders();
        orders2.setOrderNo(UUID.randomUUID().toString());
        orders2.setOrderAmt(new BigDecimal(6.00));
        ordersMapper.insertList(Arrays.asList(orders1,orders2));
    }


    /**
     * 根据主键更新实体全部字段，null值会被更新。主键值被set进record对象
     */
    @Test
    public void updateByPrimaryKey(){
        Orders orders = new Orders();
        orders.setId(254);
        orders.setOrderNo(UUID.randomUUID().toString());
        ordersMapper.updateByPrimaryKey(orders);
        System.out.println(orders);
    }


    /**
     * 根据主键更新属性不为null的值，主键值被set进record对象。
     */
    @Test
    public void updateByPrimaryKeySelective(){
        Orders orders = new Orders();
        orders.setId(255);
        orders.setOrderNo(UUID.randomUUID().toString());
        ordersMapper.updateByPrimaryKeySelective(orders);
        System.out.println(orders);
    }

    /**
     * 根据实体属性作为条件进行删除，查询条件使用等号，属性值set进record对象
     */
    @Test
    public void delete(){
        Orders orders = new Orders();
        orders.setOrderAmt(new BigDecimal(9.00));
        ordersMapper.delete(orders);
        System.out.println(orders);
    }

    /**
     * 根据主键字段进行删除，方法参数必须包含完整的主键属性,主键值set进key对象中
     */
    @Test
    public void deleteByPrimaryKey(){
        Orders orders = new Orders();
        orders.setId(254);
        orders.setOrderAmt(new BigDecimal(9.00));
        ordersMapper.deleteByPrimaryKey(orders);
        System.out.println(orders);
    }

    @Test
    public void PageHelper(){
        PageHelper.startPage(1, 10);
        List<Orders> orders = ordersMapper.selectAll();
        PageInfo<Orders> ordersPageInfo = new PageInfo<>(orders);
        System.out.println(ordersPageInfo);
    }

    @Test
    public void selectByExample(){
        Example example = new Example(Orders.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("orderNo", "5544393e-7175-4da%");
        List<Orders> orders = ordersMapper.selectByExample(example);

    }

}
