package com.qls.test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qinlinsen on 2017/4/17.
 */
public class AutowiredTest2 {
    public static void main(String[] args) {
        String configLocation="applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
       Boss2 boss=(Boss2) ac.getBean("boss2");
        System.out.println(boss);
    }
}
