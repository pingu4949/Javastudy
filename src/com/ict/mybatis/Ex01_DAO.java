package com.ict.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

// DB 처리하는 메서드들을 가지고 있는 클래스
public class Ex01_DAO {
	// -MyBatis에서 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	// 싱글턴 패턴(동기화 처리까지)
	
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			// 수동 커밋을 해야 된다.
			ss = Ex01_DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB 처리하는 메서드들 -> mapper.xml를 호출 하는 메서드
	// customer 테이블의 전체 내용 보기
	// select : 결과(resultType) 여러개, 하나 구분 
	// 		    파라미터가 없나, 하나, 두개 이상
	
	
	// customer 테이블의 전체 내용 : 결과 -> 여러개 -> List<VO>
	//							파라미터는 없다.
	public static List<Ex01_VO> getList() {
		
		List<Ex01_VO> list = null;
//		getSession().selectList(mapper.xml 의 namespace.id);
		list = getSession().selectList("customer.getSelectAll");
		return list;
		
	}
	
	// customer : 테이블의 특징 데이터보기
	// select : 결과(resultType) 여러개, 하나 구분 
	//			파라미터가 있음
	
	// 파라미터 타입이 String
	public static Ex01_VO getone(String custid) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("customer.getSelectOne", custid);
		return vo;
	}
	
	// 파라노마 값이 없어서 인자 x
	public static int getCnt() {
		int result = 0;
		result = getSession().selectOne("customer.getCount");
		return result;
		
	}
	
	// insert, update, delete는 결과 무조건 int
	// insert, update, delete는 결과 커밋도 해야 한다.
	// insert, update, delete는 
	// 파라미터 타입은 하나일때 vo, String, int
	// 파라미터 타입이 무조건 VO만들어서 넣자
	
	// insert
	public static int getinsert(Ex01_VO vo) {
		int result = 0;
		result = getSession().insert("customer.getinsert", vo);
		if (result > 0) {
			ss.commit();
			
		}
		return result;
	}
		
	
	public static int getDelete(Ex01_VO vo) {
		int result = 0;
		result = getSession().delete("customer.getDelete", vo);
		return result;
	}
	
	// update
	public static int getupdate(Ex01_VO vo) {
		int result = 0;
		result = getSession().update("customer.getupdate", vo);

		return result;
	}
	
}
