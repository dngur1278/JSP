package co.prj.sports.member.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.prj.sports.dao.DataSource;
import co.prj.sports.member.service.MemberService;
import co.prj.sports.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	
	private DataSource dataSource = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<MemberVO> memberSelectAll() {
		// TODO 회원 전체 조회
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		String sql = "select * from member";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setBirth(rs.getDate("Birth"));
				vo.setGender(rs.getString("gender"));
				vo.setAuthor(rs.getString("author"));
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	@Override
	public MemberVO memberSelectOne() {
		// TODO 회원 1명 조회
		return null;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO 회원 가입
		return 0;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO 회원 정보 수정
		return 0;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO 회원 탈퇴
		return 0;
	}
	
	private void close() {
		try {
			if (rs != null) rs.close();
			if (psmt != null) psmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
