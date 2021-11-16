

import java.io.IOException;
import java.io.PrintWriter;
import java.security.DigestException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculoIMC
 */
@WebServlet("/CalculoIMC")
public class CalculoIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws DigestException, IOException, ServletException {
   	response.setContentType("text/html;charset=-----UTF-8");
   	try (PrintWriter out = response.getWriter()) {
   		String peso = request.getParameter("peso");
   		String estatura =request.getParameter("estatura");
   		
   		IMC i = new IMC(peso, estatura);
   		i.calcularIMC();
   		request.setAttribute("imc", i);
   		request.getRequestDispatcher("/registro.jsp").forward(request, response);
   	
   	}
	}
 
   
  
	
    public CalculoIMC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
