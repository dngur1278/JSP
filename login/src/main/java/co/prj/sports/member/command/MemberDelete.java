package co.prj.sports.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.prj.sports.common.Command;
import co.prj.sports.member.service.MemberService;
import co.prj.sports.member.serviceImpl.MemberServiceImpl;
import co.prj.sports.member.vo.MemberVO;

public class MemberDelete implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 탈퇴 기능 구현
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		int result = dao.memberDelete(vo);
		
		String page = "";
		String message = "회원 탈퇴에 실패하였습니다.";
		if (result != 0) {
			page = "memberList.do";
		} else {
			request.setAttribute("message", message);
			page = "member/memberError";
		}
		
		return page;
	}

}
