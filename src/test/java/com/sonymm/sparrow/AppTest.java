package com.sonymm.sparrow;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class AppTest{
    @Autowired
    JdbcTemplate sparrowJdbcTemplate;

    @Test
    public void testJdbcTemplate(){
        String sql = "select * from sparrow_user";
        List<Map<String, Object>> list = sparrowJdbcTemplate.queryForList(sql);
        Assert.assertTrue(list.get(0).get("user_name").equals("admin"));
    }
}
