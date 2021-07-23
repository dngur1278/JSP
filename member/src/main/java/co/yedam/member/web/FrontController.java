package co.yedam.member.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.member.command.Command;
import co.yedam.member.command.MainCommend;
import co.yedam.member.command.MemberDelete;
import co.yedam.member.command.MemberDeleteForm;
import co.yedam.member.command.MemberInsert;
import co.yedam.member.command.MemberInsertForm;
import co.yedam.member.command.MemberListCommand;
import co.yedam.member.command.MemberSearchCommand;
import co.yedam.member.command.MemberSearchForm;

/**
 * Servlet implementation class FrontController
 */
//@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Command> map = new HashMap<String, Command>();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO command객체를 init에 등록!!!
		map.put("/main.do", new MainCommend());		// 홈
		map.put("/memberList.do", new MemberListCommand());	// 회원목록
		map.put("/memberSearch.do", new MemberSearchCommand());	// 회원검색
		map.put("/memberSearchForm.do", new MemberSearchForm());	// 회원검색 폼
		map.put("/memberInsertForm.do", new MemberInsertForm());	// 회원가입 폼
		map.put("/memberInsert.do", new MemberInsert());	// 회원가입
		map.put("/memberDeleteForm.do", new MemberDeleteForm());	// 회원탈퇴 폼
		map.put("/memberDelete.do", new MemberDelete());
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO 여기가 요청(command)분석 및 처리, view Page 선택하는 곳!!!!
		request.setCharacterEncoding("utf-8"); 	// 한글 깨짐 방지
		// 실제요청을 분석
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length());	// 실 요청 문 예)/main.do
		
		Command command = map.get(path);	// Command command = new MainCommand();
		String viewPage = command.execute(request, response);	// 실행될 결과를 보여줄 페이지
		
		if (!viewPage.endsWith(".do")) {		// 보여줄 페이지를 선택한다...
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
