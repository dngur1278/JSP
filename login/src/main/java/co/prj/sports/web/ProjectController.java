package co.prj.sports.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.prj.sports.command.Check;
import co.prj.sports.command.Home;
import co.prj.sports.command.IdCheckForm;
import co.prj.sports.command.IdCheckPro;
import co.prj.sports.command.Login;
import co.prj.sports.command.LoginForm;
import co.prj.sports.command.Logout;
import co.prj.sports.command.SignUpForm;
import co.prj.sports.common.Command;
import co.prj.sports.member.command.MemberDelete;
import co.prj.sports.member.command.MemberDeleteForm;
import co.prj.sports.member.command.MemberList;
import co.prj.sports.member.command.MemberSelect;
import co.prj.sports.member.command.MemberUpdate;
import co.prj.sports.member.command.MemberUpdateForm;
import co.prj.sports.member.command.MemberUpdateOk;

/**
 * Servlet implementation class ProjectController
 */
public class ProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		map.put("/check.do", new Check());
		map.put("/home.do", new Home());
		map.put("/loginForm.do", new LoginForm());
		map.put("/login.do", new Login());
		map.put("/logout.do", new Logout());
		map.put("/signUpForm.do", new SignUpForm());  
		map.put("/memberList.do", new MemberList());
		map.put("/memberSelect.do", new MemberSelect());
		map.put("/memberUpdateForm.do", new MemberUpdateForm());
		map.put("/memberUpdate.do", new MemberUpdate());
		map.put("/memberUpdateOk.do", new MemberUpdateOk());
		map.put("/memberDeleteForm.do", new MemberDeleteForm());
		map.put("/memberDelete.do", new MemberDelete());
		map.put("/idCheckForm.do", new IdCheckForm());
		map.put("/idCheckPro.do", new IdCheckPro());
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
