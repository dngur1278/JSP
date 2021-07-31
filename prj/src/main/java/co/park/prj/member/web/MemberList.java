package co.park.prj.member.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.park.prj.common.Command;
import co.park.prj.member.service.MemberService;
import co.park.prj.member.serviceImpl.MemberServiceImpl;
import co.park.prj.member.vo.MemberVO;

public class MemberList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberService dao = new MemberServiceImpl();
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = dao.memberSelectList();
		request.setAttribute("list", members);
		
		return "member/memberList";
	}

}
