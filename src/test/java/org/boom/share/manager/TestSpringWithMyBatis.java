package org.boom.share.manager;

import com.boom.ext.datasource.DaoLocator;
import com.boom.ext.datasource.dao.UserDao;
import com.boom.ext.datasource.domain.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jiangshan on 14/8/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestSpringWithMyBatis {

    //	private ApplicationContext ac = null;
    private UserDao userMapper = DaoLocator.getUserMapper();

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void testSelectByPrimaryKey() {
        UserDO user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
//        logger.info(JSON.toJSONString(user));

    }
}
