import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImcDaolmpl implements ImcDAO{

	private static final boolean IMCHistorico = false;

	public boolean IMCHistorico (IMC imc) {
		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		IMC i = new IMC();
		
		String sql = " Selecciona IDIMC " + imc.getId();
		
		      
		try {
			conn = Conexion.conectar();
			stm = conn.createStatement();
			stm.execute(sql);
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				i.setId(rs.getInt(1));
			}
			stm.close();
			conn.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error: IMC incorrecto.");
			e.printStackTrace();
		}
		return IMCHistorico;
	}
	
	public Usuario consultar(Usuario usuario) {
		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		Usuario u = new Usuario();
		
		String sql = "select id_usuario from local.person where usuario = '" + usuario.getUsuario() + "'";
		
		try {
			conn = Conexion.conectar();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setId(rs.getInt(1));
			
		}
			stm.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("Error: No se pudo validar si el usuario existe.");
			e.printStackTrace();
		}
		return u;
	}


	public IMC Historico(IMC imc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registrarIMC(IMC imc) {
		// TODO Auto-generated method stub
		return false;
	}
}
	
	
	
	
	

