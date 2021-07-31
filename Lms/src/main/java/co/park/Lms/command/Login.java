package co.park.Lms.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.park.Lms.board.service.BoardService;
import co.park.Lms.board.serviceImpl.BoardServiceImpl;
import co.park.Lms.board.vo.BoardVO;
import co.park.Lms.member.service.MemberService;
import co.park.Lms.member.serviceImpl.MemberServiceImpl;
import co.park.Lms.member.vo.MemberVO;

public class Login implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberService dao = new MemberServiceImpl();	// 멤버 Table
		BoardService boardDao = new BoardServiceImpl();	// 게시판 Table
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = dao.memberLogin(vo);
		String page = "";
		
		if (vo.getName() != null) {
			session.setAttribute("name", vo.getName());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("id", vo.getId());
			List<BoardVO> list = new ArrayList<BoardVO>();
			list = boardDao.boardSelectList();
			request.setAttribute("boards", list);
			page = "main.do";
		} else {
			page = "loginForm.do";
		}
		return page;
	}

}
