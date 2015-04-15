package com.boom.ext.datasource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiangshan on 14/8/22.
 */
public class DaoApplicationContext {

    private static ApplicationContext context;
    private static RuntimeException initException = null;

    static {
        try {
            context = new ClassPathXmlApplicationContext("classpath*:spring-mybatis.xml");
        } catch (RuntimeException e) {
            initException = e;
        }
    }

    public static ApplicationContext getApplicationContext() {
        if (context == null) {
            throw initException;
        }
        return context;
    }
}
