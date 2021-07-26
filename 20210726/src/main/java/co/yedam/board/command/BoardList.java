package co.yedam.board.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.board.service.BoardService;
import co.yedam.board.serviceImpl.BoardServiceImpl;
import co.yedam.board.vo.BoardVO;

public class BoardList implements Command {

	@Override
	public String execut(HttpServletRequest request, HttpServletResponse response) {
		// TODO 게시판 목록을 보여준다
		BoardService dao = new BoardServiceImpl();
		List<BoardVO> list = new ArrayList<BoardVO>();
		list = dao.boardSelectList();
		System.out.println(list.get(0).getbId());
		request.setAttribute("boards", list);
		return "board/boardList";
	}

}
