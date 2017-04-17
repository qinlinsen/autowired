package com.qls.test2;

import com.qls.test.Car;
import com.qls.test.Office;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qinlinsen on 2017/4/17.
 */
public class Boss2 {
    /**
     * 在域变量加入@Autowired之后，就可以不用写setter. getter方法了。
     */
    //自动装配
    @Autowired
    //自动装配
    private Car car;
    @Autowired
    private Office office;

    @Override
    public String toString() {
        return "Boss2{" +
                "car=" + car +
                ", office=" + office +
                '}';
    }
}
