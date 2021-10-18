package com.tcrcb.dao;

import com.tcrcb.pojo.User;
import com.tcrcb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        for (User user : mapper.getUserList()) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }
}
