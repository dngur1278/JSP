package co.yedam.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.member.service.MemberService;
import co.yedam.member.serviceImpl.MemberServiceImpl;
import co.yedam.member.vo.MemberVO;

public class MemberListCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 회원 전체 목록 보기
		MemberService dao = new MemberServiceImpl();	// Model을 호출
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = dao.memberSelectList();	// 데이터를 가져옴
		request.setAttribute("list", members);	// 페이지에 값을 전달하기 위해
		return "member/memberList";		// 보여줄 페이지를 선택
	}

}
