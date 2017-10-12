package com.sonymm.sparrow.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @Author suojx(1466200463@qq.com)
 * @Date 2017/10/12 15:24
 */
@Controller
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    JdbcTemplate sparrowJdbcTemplate;

    @RequestMapping(value="/getUser", method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(){
        String sql = "select * from sparrow_user";
        List<Map<String, Object>> list = sparrowJdbcTemplate.queryForList(sql);
        return new ResponseEntity<Object>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
