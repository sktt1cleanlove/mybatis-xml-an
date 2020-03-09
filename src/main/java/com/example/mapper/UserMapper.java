package com.example.mapper;

import com.example.entity.User;
import com.example.form.QueryForm;
import com.example.tk.MyBaseMapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Mapper = @MapperScan(在启动类上加个扫描包)
 */


@Repository
public interface UserMapper extends Mapper<User> {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user(id, name, pwd) values(#{id}, #{name}, #{pwd})")
    void saveUser(User user);

    @Update("update user set name=#{name}, pwd=#{pwd} where id= #{id}")
    void updateUser(User user);


    @Delete("delete from user where id=#{xxx}")
    void deleteUser(Long id);


    @Select("select * from user where id = #{xxx}")
    User findByUserId(Long userId);

    @Select("select * from user where name = #{xx}")
    List<User> findByUserName(String username);

    @Select("select count(*) from user")
    int findTotal();


    /**
     * 定义id = "userMap"可以使得@Results复用到其它方法上
     *
     */
    @Select("select * from user")
    @Results(id = "usersMap",value = { //当数据库的字段名对不上属性名可以配置(一般转驼峰就好了)
            @Result(id = true, column = "id", property = "id"), //可以声明主键
            @Result(column = "name", property = "name"),
            @Result(column = "pwd", property = "pwd"),
            @Result(column = "id", property = "accounts", many = @Many(select = "com.example.mapper.AccountMapper.findByUserId", fetchType = FetchType.LAZY)) //column = "id",指的是user表的主键
    })
    List<User> findAlices();

    @Select("select * from user where id = #{xxx}")
    @ResultMap("usersMap")
    User findAliceByUserId(Long userId);



    /**
     * *******************************************
     *
     *          XML配置方法
     *
     * *******************************************
     * */

    List<User> findUserXml();


    void saveUserXml(User user);


    int updateUserXml(User user);


    int deleteUserXml(Long id);

    User findByIdXml(Long id);

    List<User> findByName(String name);

    int countUserXml();

    User findByQueryFormIdXml(QueryForm queryForm);

}
