package com.learn.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author youzhanghao [m13732916591_1@163.com]
 * @Description:
 * @Date 2019/8/14
 */
public class SpringTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.xml");
//        applicationContext.getBean(HelloSpring.class);
        applicationContext.getBean("driver");
    }
}
