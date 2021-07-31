package co.park.prj.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.park.prj.member.service.MemberService;
import co.park.prj.member.serviceImpl.MemberServiceImpl;
import co.park.prj.member.vo.MemberVO;

public class MemberSelectOne implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo = dao.memberSelect(vo);
	
		if(vo.getName() != null) {
			request.setAttribute("member", vo);
		} else {
			request.setAttribute("message", "존재하지 않는 아이디 입니다.");
		}
		
		return "member/memberSelectOne";
	}

}
