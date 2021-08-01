package co.prj.sports.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.prj.sports.common.Command;
import co.prj.sports.member.service.MemberService;
import co.prj.sports.member.serviceImpl.MemberServiceImpl;
import co.prj.sports.member.vo.MemberVO;

public class MemberSelect implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 멤버 1명 상세 조회
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo = dao.memberSelectOne(vo);
		request.setAttribute("member", vo);
		return "member/memberSelect";
	}

}
