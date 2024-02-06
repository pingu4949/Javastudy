package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Ex02_DAO {
	// - MyBatis에서 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;

	// 싱글턴 패턴(동기화 처리까지)

	private synchronized static SqlSession getSession() {
		if (ss == null) {
			// 수동으로 커밋해줘야된다.
			ss = Ex02_DBService.getFactory().openSession();

		}
		return ss;
	}

	// DB처리하는 메서드들 -> mapper.xml를 호출 하는 메서드

	// Member 테이블의 전체 보기 -> 값이 여러개 -> List<VO>
	public static List<Ex02_VO> getlist() {
		List<Ex02_VO> list = null;
		list = getSession().selectList("Members.getSelectAll");

		return list;
	}

	// Member 테이블의 특정값만 보기 -> 값이 한개 -> 피라미드 값이 String
	public static Ex02_VO getone(String idx) {
		Ex02_VO vo = null;
		vo = getSession().selectOne("Members.getSelectOne", idx);
		return vo;
	}

	public static int getcount() {
		int result = 0;
		result = getSession().selectOne("Members.getCount");
		return result;
	}

	// insert, update, delete -> 결과 무조건 int
	public static int getinsert(Ex02_VO vo) {
		int result = 0;
		result = getSession().insert("Members.getinsert", vo);
		if (result > 0) {
			ss.commit();

		}
		return result;

	}

	public static int getdelete(Ex02_VO vo) {
		int result = 0;
		result = getSession().delete("Members.getdelete", vo);
		if (result > 0) {
			ss.commit();

		}
		return result;

	}

	public static int getupdate(Ex02_VO vo) {
		int result = 0;
		result = getSession().update("Members.getupdate", vo);
		if (result > 0) {
			ss.commit();

		}
		return result;

	}

	public static Ex02_VO getLogin(Ex02_VO vo5) {
		Ex02_VO vo = null;
		vo = getSession().selectOne("Members.Login", vo5);
		// 아이디가 없으면 null이 되므로 return null;
		if (vo != null) {
			// pw를 얻어내자 (db에 암호화 되어있다)
			String pw = vo.getPw();

			// 우리가 입력한 pw 를 암호화 하자 (나중에)
			// String s_pw = vo5.getPw().암호화 메서드 사용

			// db에서 꺼낸 pw와 암호화된 pw를 비교하자 (나중에)
			// 이것이 true 성공

			boolean res = true;
			
			if (res) {
				return vo;

			} else {
				// false이면
				return null;
			}

		} else {
			return null;
		}

	}
}
