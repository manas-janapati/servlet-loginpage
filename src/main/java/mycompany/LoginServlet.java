package mycompany;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		// Database connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
			
			// Fetching user input
			String n = request.getParameter("txtName");
			String m = request.getParameter("txtMob");
			String e = request.getParameter("txtEmail");
			String p = request.getParameter("txtPwd");
			
			// Query to check user credentials
			PreparedStatement ps = con.prepareStatement("SELECT uname FROM login WHERE uname=? AND mobile=? AND email=? AND password=?");
			ps.setString(1, n);
			ps.setString(2, m);
			ps.setString(3, e);
			ps.setString(4, p);
			
			// Execute query
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				// Forward to welcome.jsp if login successful
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
			else {
				// Display error message
				out.println("<font color=red size=18>Login Failed!!<br>");
				out.println("<a href='login.jsp'>Try again.</a>");
			}
			
			con.close();
		} 
		catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
			out.println("<font color=red size=18>Error Connecting to Database!!<br>");
		}
	}
}
