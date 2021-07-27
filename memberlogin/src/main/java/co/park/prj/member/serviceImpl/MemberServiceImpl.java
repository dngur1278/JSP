package co.park.prj.member.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import co.park.prj.common.DAO;
import co.park.prj.member.service.MemberService;
import co.park.prj.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<MemberVO> memberSelectList() {
		// TODO 전체조회
		return null;
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO 한건 조회
		return null;
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {
		// TODO 로그인 체크
		String sql = "select name, author from member where id = ? and password = ? and state = 'Y'";
		
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setAuthor(rs.getString("author"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cloase();
		}
		return vo;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO 회원 추가
		return 0;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO 회원 탈퇴
		return 0;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO 회원 정보 수정
		return 0;
	}

	private void cloase() {
		try {
			if (rs != null) rs.close();
			if (psmt != null) psmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
