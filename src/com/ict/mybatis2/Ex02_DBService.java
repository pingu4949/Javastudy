package com.ict.mybatis2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Ex02_DBService {
	static private SqlSessionFactory factory;
	static String resource = "com/ict/mybatis2/ex02_config.xml";

	// static 초기화
	static {
		try {
			// resource경로를 읽기위한것
			InputStream in = Resources.getResourceAsStream(resource);
			// 빌드하기 위한것
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// DAO에서 factory를 호출한 메서드
	public static SqlSessionFactory getFactory() {

		return factory;

	}

}
