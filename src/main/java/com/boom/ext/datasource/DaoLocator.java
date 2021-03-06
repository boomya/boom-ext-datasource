package com.boom.ext.datasource;

import com.boom.ext.datasource.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiangshan on 14/8/22.
 */
public class DaoLocator {

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

    public static UserDao getUserMapper() {
        return (UserDao) getApplicationContext().getBean("userMapper");
    }
}
