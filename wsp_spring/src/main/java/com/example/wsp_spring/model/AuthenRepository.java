package com.example.wsp_spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import static org.springframework.jdbc.core.BeanPropertyRowMapper.*;

public class AuthenRepository {
    @Autowired
    private JdbcTemplate jdbc;
    public Object select(String userId) {
        var sql = "select user_id,passphrase,user_name,user_role" +
                "from authen where user_id=?";
        return jdbc.queryForObject(sql,newInstance(Authen.class),userId);
    }
}
