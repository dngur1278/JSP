package co.park.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.park.prj.common.Command;

public class Logout implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그아웃
		HttpSession session = request.getSession();
		String message = session.getAttribute("name") + "님 정상저으로 로그아웃 되었습니다.";
		session.invalidate(); // 세션을 삭제
//		session.removeAttribute("name");
//		session.removeAttribute("author");
		request.setAttribute("mesage", message);
		return "member/loginError";
	}

}
