package com.example.controller;

/**
 * @author: czh;
 * @date: 2020/3/9;
 * @description: ;
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "Swagger2控制层", value = "Swagger2Controller")
@RequestMapping(value = "swagger2")
public class TestController {

    @ApiOperation(value = "swagger demo", notes = "实例")
    @PostMapping(value = "hello")
    @ApiImplicitParams({@ApiImplicitParam(value = "用户名", name = "name"),
            @ApiImplicitParam(value = "密码", name = "pwd")})
    public void hello(@RequestParam(value = "name") String name,
                      @RequestParam(value = "pwd") String pwd) {
        log.info(String.format("姓名[%s],密码[%s]", name, pwd));
    }
}
