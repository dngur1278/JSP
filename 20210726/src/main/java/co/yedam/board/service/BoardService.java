package co.yedam.board.service;

import java.util.List;

import co.yedam.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> boardSelectList();	// 전체 목록 
	BoardVO boardSelect(BoardVO vo);	// 한건 조회
	int boardInsert(BoardVO vo);		// 추가
	int boardDelete(BoardVO vo);		// 삭제
	int boardUpdate(BoardVO vo);		// 업뎃
}
