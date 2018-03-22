import java.util.Scanner;

public class Libro implements GestionBiblio{

	private String titulo;
	private String autor;
	private String fechaPublicacion;
	private Double precio;
	
	Libro(){
		
	}
	
	// construct
	Libro(String titulo, String autor, String fechaPublicacion, Double precio){
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
	
	// *** AUTOR ****
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	// *** FECHA PUBLICACION ***
	public String setFechaPublicacion() {
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

	//Utilizamos el método de la interfaz
	@Override
	public void ejectuarAccion() {
		
		Libro libro = new Libro();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el titulo del libro: ");
		String titulo = sc.nextLine();
		
		System.out.println("Dime el autor: ");
		String autor = sc.nextLine();
		
		System.out.println("Dime la fecha de publicación: ");
		String fecha_pub = sc.next();
		
		System.out.println("Dime el precio del libro: ");
		double precio = sc.nextDouble();
		
		System.out.println("Libro correctamente dado de alta: \n" + 
							"Titulo: " + titulo + "\n" +
							"Autor: " + autor + "\n" + 
							"Fecha Publicación: " + fecha_pub + "\n" + 
							"Precio: " + precio);
		
	}
	
	
}
