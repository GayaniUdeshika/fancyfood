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

@WebServlet("/Reset_password")
public class Reset_password extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Reset_password() {
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url1 = "jdbc:mysql://localhost:3306/fancyfood";
            String uname1 = "root";
            String pass = "XfR648Ki";

            Connection con = DriverManager.getConnection(url1, uname1, pass);

            String oldpsw = request.getParameter("oldpassword");
            String newpsw = request.getParameter("newpassword");
            String uname = request.getParameter("username");
            String emid = request.getParameter("id");

            PreparedStatement psvalidate = con
                    .prepareStatement("SELECT * FROM login WHERE id=? AND name=? AND password=?");
            psvalidate.setString(1, emid);
            psvalidate.setString(2, uname);
            psvalidate.setString(3, oldpsw);
            ResultSet rsvalidate = psvalidate.executeQuery();

            if (rsvalidate.next()) {
                // Old password matches, proceed to update the password
                PreparedStatement ps = con.prepareStatement("UPDATE login SET password=? WHERE id=?");
                ps.setString(1, newpsw);
                ps.setString(2, emid);
                int rs = ps.executeUpdate();

                if (rs > 0) {
                    // Password updated successfully
                    String Success = "Password successfully changed";
                    request.setAttribute("Successpass", Success);
                    request.getRequestDispatcher("Reset_password_success.jsp").forward(request, response);
                } else {
                    String Failed = "Password update failed";
                    request.setAttribute("Successpass", Failed);
                    request.getRequestDispatcher("Reset_password_success.jsp").forward(request, response);
                }
            } else {
                String Failed = "Invalid user credentials";
                request.setAttribute("Successpass", Failed);
                request.getRequestDispatcher("Reset_password_success.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
