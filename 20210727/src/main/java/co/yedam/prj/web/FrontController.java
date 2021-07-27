package co.yedam.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.prj.command.Home;
import co.yedam.prj.command.Login;
import co.yedam.prj.command.LoginForm;
import co.yedam.prj.command.Logout;
import co.yedam.prj.common.Command;

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
		// TODO Auto-generated method stub
		map.put("/home.do", new Home());
		map.put("/loginForm.do", new LoginForm());
		map.put("/login.do", new Login());
		map.put("/logout.do", new Logout());
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO 분석, 페이지
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length());
		
		Command command = map.get(path);
		String viewPage = command.execute(request, response);
		
		if (!viewPage.endsWith(".do")) {
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
