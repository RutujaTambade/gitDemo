package Demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class abc
 */
@WebServlet("/abc")
public class abc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public abc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String id=request.getParameter("id");
		String Name=request.getParameter("Name");
		String city=request.getParameter("city");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load created");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
			System.out.println("connection is done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
