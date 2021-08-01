package co.prj.sports.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.prj.sports.common.Command;
import co.prj.sports.member.service.MemberService;
import co.prj.sports.member.serviceImpl.MemberServiceImpl;
import co.prj.sports.member.vo.MemberVO;

public class MemberUpdateOk implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 회원정보 수정 확인
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setId(request.getParameter("id"));
		
		int n = dao.memberUpdate(vo);
		String page = "";
		String message = "회원정보 수정에 실패하였습니다.";
		if (n != 0) {
			page = "memberList.do";
		} else {
			request.setAttribute("message", message);
			page = "member/memberError";
		}
		
		return page;
	}

}
