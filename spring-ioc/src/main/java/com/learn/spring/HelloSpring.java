package com.learn.spring;

/**
 * @Author youzhanghao [m13732916591_1@163.com]
 * @Description:
 * @Date 2019/8/14
 */
public class HelloSpring {

    private String name;
    private int sex;

    private Hi hi;

    public HelloSpring(){ }

//    构造函数构建
    public HelloSpring(Hi hi){
        this.hi = hi;
    }


    public HelloSpring(String name,int sex){

        this.name = name;
        this.sex = sex;

    }

//    A B测试
    public static HelloSpring build(String type){

        if ("A".equals(type)){
            return new HelloSpring("yzh",1);
        } else if ("B".equals(type)){
            return new HelloSpring("htt",0);
        }else{
            throw new IllegalArgumentException("Must pass A or B");
        }

//        return new HelloSpring();
    }


}
