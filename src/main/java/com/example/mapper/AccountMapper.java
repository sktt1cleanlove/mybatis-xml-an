package com.example.mapper;

import com.example.entity.Account;
import com.example.form.QueryForm;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountMapper {

    /**
     * 多对一配置
     *
     */
    @Select("select * from account")
    @Results(id = "accountMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "money", property = "money"),
            @Result(column = "user_id", property = "userId"),
            @Result(property = "user", column = "user_id", one = @One(select = "com.example.mapper.UserMapper.findByUserId", fetchType = FetchType.EAGER))
    })
    List<Account> findAll();

    @Select("select * from account where user_id = #{userId}")
    List<Account> findByUserId(Long userId);


    /**
     *
     * *********************************
     *
     *          XML配置
     *
     * **********************************
     *
     *
     * */

    Account findByIdXml(Long id);


    List<Account> findByAccountXml(Account account);

    List<Account> findByAccountMove1Xml(Account account);

    List<Account> findAccountByIdsXml(QueryForm queryForm);
}
