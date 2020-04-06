package srvlt;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//need to put package name inside parenthesis to map the package with this class
@WebServlet("/srvlt")
public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
		super();
	}
@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException{
		//response.getWriter().println("Hello World i am happy");
		String yourName = request.getParameter("yourName");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello " + " " + yourName + " </h1>");
		writer.close();
	}
		

}
