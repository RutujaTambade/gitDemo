

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class abd
 */
@WebServlet("/abd")
public class abd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public abd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String fname=request.getParameter("fname");

		String mname=request.getParameter("mname");

		String lname=request.getParameter("lname");

		System.out.println(fname);

		System.out.println(mname);

		System.out.println(lname);

		try {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "root");

		PreparedStatement st = con.prepareStatement("delete form  where r=?,?,?");

		st.setString(1, fname);

		st.setString(2, mname);

		st.setString(3, lname);

		int i = st.executeUpdate();

		Statement st1 = con.createStatement();

		ResultSet rs = st.executeQuery("select * from servlet");

		rs.close();

		st1.close();

		st.close();

		con.close();

		} catch (Exception e) {

		System.out.println(e);

		}

		}

		


	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String ab = request.getParameter("userid");
		
		
		
	}

}
