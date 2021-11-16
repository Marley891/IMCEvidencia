

import java.io.IOException;
import java.io.PrintWriter;
import java.security.DigestException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "/registro", urlPatterns = {"/registro"})
public class registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
         throws DigestException, IOException, ServletException {
	   response.setContentType("text/html;charset=UTF-8");
	   try (PrintWriter out = response.getWriter()) {
		 String nombre = request.getParameter("nombre");
		 String apellido = request.getParameter("apellido");
		 String edad = request.getParameter("edad");
		 String sexo = request.getParameter("sexo");
		 String usuario = request.getParameter("usuario");
		 String password= request.getParameter("password");
		 
		 Usuario user = new Usuario(nombre, apellido, edad, sexo, usuario, password);
		 
		 if(consultar(user).getId() == 0) {
			registrar(user);
			request.setAttribute("usuarioRegistrado", "Tu usuario fue creado exitosamente");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		 } else  {
			request.setAttribute("usuarioExistente", "Error el usuario ya existe");
		    request.getRequestDispatcher("/registro.jsp").forward(request, response); 
		 }
		 
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
    
	public void registrar(Usuario usuario) {
		UsuarioDAO dao = new UsuarioDaoImpl();
		dao.registrar(usuario);
	}
	
	public Usuario consultar(Usuario usuario) {
		UsuarioDAO dao = new UsuarioDaoImpl();
		return dao.consultar(usuario);
	}
}
