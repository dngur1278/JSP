package co.prj.sports.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.prj.sports.common.Command;
import co.prj.sports.member.service.MemberService;
import co.prj.sports.member.serviceImpl.MemberServiceImpl;
import co.prj.sports.member.vo.MemberVO;

public class MemberList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 회원 리스트 출력
		MemberService memberDao = new MemberServiceImpl();
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = memberDao.memberSelectAll();
		
		request.setAttribute("list", list);
		
		return "member/memberList";
	}

}
