package com.dongzhih.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            //1. 读取配置文件,读成数据流
            InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

            //2. 创建SqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
    public static void commitAndClose(SqlSession sqlSession){
        if (sqlSession != null){
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
