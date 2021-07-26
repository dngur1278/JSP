package co.yedam.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.board.service.BoardService;
import co.yedam.board.serviceImpl.BoardServiceImpl;
import co.yedam.board.vo.BoardVO;

public class BoardUpdate implements Command {

	@Override
	public String execut(HttpServletRequest request, HttpServletResponse response) {
		// TODO 수정 완료
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		vo.setbId(Integer.valueOf(request.getParameter("bId")));
		vo.setbTitle(request.getParameter("bTitle"));
		vo.setbContent(request.getParameter("bContent"));
		int n = dao.boardUpdate(vo);
		System.out.println(n);
		
		String page = "";
		if (n != 0) {
			page = "boardList.do";
		} else {
			page = "board/boardUpdateFail";
		}
		
		return page;
	}

}
