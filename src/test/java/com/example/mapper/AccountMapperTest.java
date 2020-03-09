package com.example.mapper;

import com.example.entity.Account;
import com.example.form.QueryForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: czh;
 * @date: 2019/12/31;
 * @description: ;
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountMapperTest {


    @Autowired
    AccountMapper accountMapper;

    @Test
    public void findAll() {
        List<Account> all = accountMapper.findAll();
        System.out.println(all);
    }

    @Test
    public void findByUserId() {
        List<Account> byUserId = accountMapper.findByUserId(1L);
        System.out.println(byUserId);
    }

    @Test
    public void findByIdXml() {
        Account byIdXml = accountMapper.findByIdXml(1L);
        System.out.println(byIdXml);
    }

    @Test
    public void findByAccountXml() {
        Account account = new Account();
        account.setName("zs");
        List<Account> byAccountXml = accountMapper.findByAccountXml(account);
    }

    @Test
    public void findAccountByIdsXml() {
        QueryForm queryForm = new QueryForm();
        List<Long> ids = Arrays.asList(1L, 2L);
        queryForm.setIds(ids);
        List<Account> accountByIdsXml = accountMapper.findAccountByIdsXml(queryForm);
        System.out.println(accountByIdsXml);
    }
}