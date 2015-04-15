package com.boom.ext.datasource.dao.impl;

import com.boom.ext.datasource.dao.UserDao;
import com.boom.ext.datasource.domain.UserDO;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by jiangshan on 14/8/24.
 */
@Dao
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(UserDO record) {
        return 0;
    }

    @Override
    public int insertSelective(UserDO record) {
        return 0;
    }

    @Override
    public UserDO selectByPrimaryKey(Integer id) {
        System.out.println("======================================");
        return getSqlSession().selectOne("selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserDO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserDO record) {
        return 0;
    }
}
