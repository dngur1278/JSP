package co.yedam.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.member.service.MemberService;
import co.yedam.member.serviceImpl.MemberServiceImpl;
import co.yedam.member.vo.MemberVO;

public class MemberInsert implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 회원가입 처리
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		String[] hobbys = request.getParameterValues("hobbys");
		String hobby = "";
		for (String str: hobbys) {
			hobby += str + ",";
		}	
		hobby = hobby.substring(0, hobby.length()-1);
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setAge(Integer.valueOf(request.getParameter("age")));
		vo.setHobby(hobby);
		
		int n = dao.memberInsert(vo);
		String view;
		if (n != 0) {
			view = "memberList.do";
		} else {
			request.setAttribute("message", "입력이 실패 했습니다.");
			view = "member/memberInsertFail";
		}
		return view;
	}

}
