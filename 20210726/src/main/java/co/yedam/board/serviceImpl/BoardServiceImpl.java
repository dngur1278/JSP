package co.yedam.board.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.board.dao.DAO;
import co.yedam.board.service.BoardService;
import co.yedam.board.vo.BoardVO;

public class BoardServiceImpl implements BoardService {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<BoardVO> boardSelectList() {
		// TODO 게시판 목록 가져오기
		List<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO vo;
		String sql = "select * from board order by bid desc";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				vo = new BoardVO();
				vo.setbId(rs.getInt("bid"));
				vo.setbTitle(rs.getString("btitle"));
//				vo.setbContent(rs.getString("bcontent"));
				vo.setbWriter(rs.getString("bwriter"));
				vo.setbDate(rs.getDate("bdate"));
				vo.setbHit(rs.getInt("bhit"));
				
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
	public BoardVO boardSelect(BoardVO vo) {
		// TODO 한행 가져 오기
		String sql = "select * from board where bid = ?";
		
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getbId());
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				vo.setbId(rs.getInt("bid"));
				vo.setbTitle(rs.getString("btitle"));
				vo.setbContent(rs.getString("bcontent"));
				vo.setbWriter(rs.getString("bwriter"));
				vo.setbDate(rs.getDate("bdate"));
				vo.setbHit(rs.getInt("bhit"));
				
				hitUpdate(vo.getbId());	// 조회수 증가 메소드
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return vo;
	}

	@Override
	public int boardInsert(BoardVO vo) {
		// TODO 글 추가
		String sql = "insert into board (bid, btitle, bcontent, bwriter, bdate) values (b_seq.nextval, ?, ?, ?, ?)";
		int result = 0;
		
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getbTitle());
			psmt.setString(2, vo.getbContent());
			psmt.setString(3, vo.getbWriter());
			psmt.setDate(4, vo.getbDate());
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	@Override
	public int boardDelete(BoardVO vo) {
		// TODO 게시판 1개 삭제\
		String sql = "delete from board where bid = ?";
		int result = 0;
		
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getbId());
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		// TODO 게시판 글의 제목과 내용 업데이트
		String sql = "update board set btitle = ?, bcontent = ? where bid = ?";
		int result = 0;
		
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getbTitle());
			psmt.setString(2, vo.getbContent());
			psmt.setInt(3, vo.getbId());
			result = psmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();		
		}
		return result;
	}
	
	private void close() {
		// TODO 연결을 종료 -> 열어준 순서의 반대로
		try {
			if (rs != null) rs.close();
			if (psmt != null) psmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void hitUpdate(int id) {
		// TODO 조회수 증가
		String sql = "update board set bhit = bhit+1 where bid = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
