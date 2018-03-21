
public class Cliente {
	
	private String nombre;
	private String dni;
	
	Cliente (String nombre, String dni){
		this.nombre = nombre;
		this.dni = dni;
	}
	
	//NOMBRE//	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	//DNI//
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
	}
	
}
