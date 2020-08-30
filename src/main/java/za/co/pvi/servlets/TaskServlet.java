package za.co.pvi.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.pvi.services.TaskService;

@WebServlet("/createTask")
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String description = request.getParameter("description");
		request.setAttribute("description", description );
		
		TaskService taskService = new TaskService();
		taskService.createTask(description);
		
		request.getRequestDispatcher("register.jsp").forward(request, response);
		
	}

}
