package co.yedam.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeCommand implements Command {

	@Override
	public String execut(HttpServletRequest request, HttpServletResponse response) {
		// TODO 시작페이지 돌려주기
		return "home/home";
	}

}
