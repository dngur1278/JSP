package co.park.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.park.prj.common.Command;
import co.park.prj.member.service.MemberService;
import co.park.prj.member.serviceImpl.MemberServiceImpl;
import co.park.prj.member.vo.MemberVO;

public class Login implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그인 실행
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession();		// 서버가 가지고 있는 세션객체를 호출
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = dao.memberLogin(vo);
		
		String page = "";
		if (vo.getName() != null) {
			session.setAttribute("name", vo.getName());
			session.setAttribute("id", vo.getId());
			session.setAttribute("author", vo.getAuthor());
			page = "member/loginSuccess";
		} else {
			String message = "존재하지 않는 아이디 혹은 비밀번호가 틀렸습니다.";
			request.setAttribute("message", message);
			page = "member/loginError";
		}
		return page;
	}

}
