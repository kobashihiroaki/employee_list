package employee_list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet(name = "list", urlPatterns = "/list")
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		perform(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		perform(request, response);
	}


	protected void perform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ListDAO ldao = new ListDAO();

		List<EmployeesDTO> list = ldao.getList();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}


}
