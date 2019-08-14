package com.learn.spring;

import org.springframework.beans.factory.FactoryBean;

import java.sql.DriverManager;

/**
 * @Author youzhanghao [m13732916591_1@163.com]
 * @Description:
 * @Date 2019/8/14
 */
public class DriverFactoryBean implements FactoryBean {


    private String jdbcUrl;

    public Object getObject() throws Exception {
        return DriverManager.getDriver(jdbcUrl);
    }

    public Class<?> getObjectType() {
        return java.sql.Driver.class;
    }

    public boolean isSingleton() {
        return false;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
