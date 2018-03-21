
public class Libro {

	private String titulo;
	private String autor;
	private Integer fechaPublicacion;
	private Double precio;
	
	Libro(String titulo, String autor, Integer fechaPublicacion, Double precio){
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.precio = precio;
	}
	
	// *** TITULO ***
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	// *** AUTOR ***
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	// *** FECHA PUBLICACION ***
	public Integer setFechaPublicacion() {
		return this.fechaPublicacion;
	}
		
	public void setfechaPublicacion(String fechaPublicacion) {
		this.titulo = fechaPublicacion;
	}
		
	// *** PRECIO ***
	public Double getPrecio() {
		return this.precio;
	}
		
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
