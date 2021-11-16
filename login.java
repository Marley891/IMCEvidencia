

import java.io.IOException;
import java.io.PrintWriter;
import java.security.DigestException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "/login", urlPatterns = {"/login"})
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
             throws DigestException, IOException {
    	response.setContentType("text/html;charset=-----UTF-8");
    	try (PrintWriter out = response.getWriter()) {
    		String usuario = request.getParameter("usuario");
    		String password = request.getParameter("password");
    		
    	}
    	
    }
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
