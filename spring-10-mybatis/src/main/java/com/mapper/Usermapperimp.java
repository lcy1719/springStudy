package com.mapper;

import com.cy.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class Usermapperimp implements Usermapper{
    //所有的操作，原来都使用SQL session来执行，现在使用sqlSessionTemplate
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<User> select() {
        Usermapper mapper = sqlSessionTemplate.getMapper(Usermapper.class);
        return mapper.select();
    }
}
