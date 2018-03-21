
public class Registro {

	private String titulo;
	private int id;
	private int cantidad;
	
	Registro(String titulo, int id, int cantidad){
		this.titulo = titulo;
		this.id = id;
		this.cantidad = cantidad;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
