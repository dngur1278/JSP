package co.park.Lms.board.service;

import java.util.List;

import co.park.Lms.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> boardSelectList();	// 게시판 전체조회
	BoardVO boardSelect(BoardVO vo);	// 게시판 1건 조회
	int boardInsert(BoardVO vo);		// 게시판 추가
	int boardDelete(BoardVO vo);		// 게시판 삭제
	int boardUpdate(BoardVO vo);		// 게시판 수정
}
