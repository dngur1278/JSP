package co.yedam.board.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.board.service.BoardService;
import co.yedam.board.serviceImpl.BoardServiceImpl;
import co.yedam.board.vo.BoardVO;

public class InsertBoard implements Command {

	@Override
	public String execut(HttpServletRequest request, HttpServletResponse response) {
		// TODO 게시글 등록
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		vo.setbWriter(request.getParameter("bWriter"));
		vo.setbTitle(request.getParameter("bTitle"));
		vo.setbContent(request.getParameter("bContent"));
		vo.setbDate(Date.valueOf(request.getParameter("bDate")));
		int n = dao.boardInsert(vo);
		
		String page="";
		
		if (n != 0) {
			page ="boardList.do";
		} else {
			page = "board/boardInsertFail";
		}
		return page;
	}

}
