package co.prj.sports.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.prj.sports.common.Command;

public class MemberUpdateForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 회원 정보 수정을 위해 id로 검색
		return "member/memberUpdateForm";
	}

}
