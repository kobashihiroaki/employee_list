package employee_list;

import java.io.IOException;
import java.io.PrintWriter;

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
//		// TODO Auto-generated method stub
		response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        ListDAO ldao = new ListDAO();
        PrintWriter out = response.getWriter();
        out.print(ldao.getJson());
        out.flush();
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 TODO Auto-generated method stub
//		perform(request, response);
//	}


}
