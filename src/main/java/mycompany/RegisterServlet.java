package mycompany;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		// Getting user input from JSP
		String name = request.getParameter("txtName");
		String mobile = request.getParameter("txtMob");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPwd");
		
		// Database connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
			
			// Insert query
			PreparedStatement ps = con.prepareStatement("INSERT INTO login (uname, mobile, email, password) VALUES (?, ?, ?, ?)");
			ps.setString(1, name);
			ps.setString(2, mobile);
			ps.setString(3, email);
			ps.setString(4, password);
			
			// Execute insert query
			int i = ps.executeUpdate();
			
			if(i > 0) {
				// Redirect to login.jsp after registration
				response.sendRedirect("login.jsp");
			} else {
				out.println("<font color='red' size='18'>Registration Failed!</font>");
			}
			
			con.close();
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			out.println("<font color='red' size='18'>Database Error. Try again later!</font>");
		}
	}
}
