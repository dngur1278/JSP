package co.prj.sports.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.prj.sports.common.Command;
import co.prj.sports.member.service.MemberService;
import co.prj.sports.member.serviceImpl.MemberServiceImpl;
import co.prj.sports.member.vo.MemberVO;

public class IdCheckPro implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 아이디 중복체크 확인!
		MemberService dao = new MemberServiceImpl();
		String id = request.getParameter("id");
		int result = dao.checkId(id);
		
		request.setAttribute("cnt", result);
		return "home/idCheckPro";
	}

}
