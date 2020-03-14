

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class DatabaseServlet
 */
@WebServlet("/DatabaseServlet")
public class DatabaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatabaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			int flag=0;
			String lid=request.getParameter("login");
			String pwd=request.getParameter("passwd");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from users");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			while(rs.next())
			{
				String t1=rs.getString(1);
				String t2=rs.getString(2);
				if(lid.equals(t1)&&pwd.equals(t2))
					flag=1;
					break;
			}
				if(flag==1)
				out.println("<b>Authorized user</b>");
				else
					out.println("<b>Unauthorized user</b>");
				out.print("</body></html>");
				out.close();
				rs.close();
				st.close();
				con.close();
			
		}
		catch(Exception e) {
			
		}
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
