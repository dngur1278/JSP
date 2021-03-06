package co.prj.sports.board.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.prj.sports.board.command.SelectBoard;
import co.prj.sports.board.command.UpdateBoard;
import co.prj.sports.board.command.BoardList;
import co.prj.sports.board.command.Command;
import co.prj.sports.board.command.DeleteBoard;
import co.prj.sports.board.command.DeleteForm;
import co.prj.sports.board.command.HomeCommand;
import co.prj.sports.board.command.InsertBoard;
import co.prj.sports.board.command.InsertForm;
import co.prj.sports.board.command.UpdateForm;
import co.prj.sports.event.command.CountEvent;
import co.prj.sports.event.command.DeleteEvent;
import co.prj.sports.event.command.DeleteEventForm;
import co.prj.sports.event.command.EventList;
import co.prj.sports.event.command.InsertEvent;
import co.prj.sports.event.command.InsertEventForm;
import co.prj.sports.sns.command.CommentsForm;
import co.prj.sports.sns.command.DeleteComments;
import co.prj.sports.sns.command.DeleteSns;
import co.prj.sports.sns.command.SearchSns;
import co.prj.sports.sns.command.SnsInsert;
import co.prj.sports.sns.command.SnsInsertForm;
import co.prj.sports.sns.command.SnsList;


public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private HashMap<String, Command> map= new HashMap<String, Command>();
      
    public FrontController() {
        super();
    }
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	map.put("/home.do", new HomeCommand());
	
	map.put("/boardList.do", new BoardList());
	map.put("/selectBoard.do", new SelectBoard());
	map.put("/insertForm.do",new InsertForm());
	map.put("/insertBoard.do",new InsertBoard());
	map.put("/deleteForm.do",new DeleteForm());
	map.put("/deleteBoard.do", new DeleteBoard());
	map.put("/updateForm.do",new UpdateForm());
	map.put("/updateBoard.do",new UpdateBoard());
	
	map.put("/snsList.do",new SnsList());
	map.put("/searchSns.do",new SearchSns());
	map.put("/snsInsertForm.do", new SnsInsertForm());
	map.put("/snsInsert.do", new SnsInsert());
	map.put("/commentsForm.do", new CommentsForm());
	map.put("/deleteSns.do",new DeleteSns());
	map.put("/deleteComments.do", new DeleteComments());
	
	map.put("/eventList.do",new EventList());
	map.put("/countEvent.do",new CountEvent());
	map.put("/insertEventForm.do", new InsertEventForm());
	map.put("/insertEvent.do", new InsertEvent());
	map.put("/deleteEventForm.do", new DeleteEventForm());
	map.put("/deleteEvent.do", new DeleteEvent());

	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri=request.getRequestURI();
		String context=request.getContextPath();
		String page=uri.substring(context.length());
		
		Command command =map.get(page);
		String viewPage=command.execute(request, response);
		
		if(!viewPage.endsWith(".do")) {
			viewPage="WEB-INF/views/"+viewPage+".jsp";
		}
		RequestDispatcher dispatcher =request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
