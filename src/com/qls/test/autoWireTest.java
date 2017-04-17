package com.qls.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qinlinsen on 2017/4/17.
 */
public class autoWireTest {
    public static void main(String[] args) {
        String configLocation="beans.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
        /**
         * use spring container create an instance of Boss.
         * this embody of IOC (inversion of controller)
         */
        Boss boss=(Boss) ac.getBean("boss2");
        System.out.println(boss);
    }
}
