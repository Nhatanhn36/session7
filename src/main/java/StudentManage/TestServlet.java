package StudentManage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //
        String url = "jdbc:mysql://localhost:3306/studentmanagement";
        String username = "root";
        String password = "";

        //
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");

        //
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            //myConn = dataSource.getConnection();
            Class.forName("com.mysql.jdbc.Driver");

            myConn = DriverManager.getConnection(url,username,password);

            //
            String sql = "select * from student";
            myStmt = myConn.createStatement();

            //
            myRs = myStmt.executeQuery(sql);

            //
            while (myRs.next()){
                String email = myRs.getString("email");
                out.println(email);
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
