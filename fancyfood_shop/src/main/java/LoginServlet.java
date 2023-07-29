

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url1 = "jdbc:mysql://localhost:3306/fancyfood";
            String uname1 = "root";
            String pass = "XfR648Ki";
            
            Connection con = DriverManager.getConnection(url1, uname1, pass);
            System.out.println("Successful");
            
            String unamee = request.getParameter("username");
            String pass2 = request.getParameter("password");
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE name=? AND password=?");
            ps.setString(1, unamee);
            ps.setString(2, pass2);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
            	
            	request.setAttribute("valied_user", unamee);
            	request.getRequestDispatcher("account.jsp").forward(request, response);
            	
//                System.out.println("successful");
//                // Forward the request to welcom.jsp
//                RequestDispatcher rd = request.getRequestDispatcher("welcom.jsp");
//                rd.forward(request, response); // Forward the request and response objects
            } else {
            	
//            	String.
//            	request.setAttribute("valied_user", unamee);
//            	request.getRequestDispatcher("account.jsp").forward(request, response);
            	
                //System.out.println("<p>login failed</p>");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
