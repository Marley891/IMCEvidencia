import java.sql.Date;


public class IMC {


	private float estatura;
	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	private float peso;
	private float imc;
	private Date fecha;
	private int id;
	private int idUsuario;
	

	public IMC(String estatura, String peso) {
		this.estatura = Integer.parseInt(estatura);
		this.peso = Integer.parseInt(peso);
	}
	
	public IMC() {
		
	}
	
	public void calcularIMC() {
		double imc = this.peso / (this.estatura );
		this.setImc(imc);
		
		
	}

	private void setImc(double imc2) {
		// TODO Auto-generated method stub
		
	}
}

	
	
	



		
	
	
