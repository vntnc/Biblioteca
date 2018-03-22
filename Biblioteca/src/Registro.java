import java.util.Scanner;

public class Registro implements GestionBiblio{

	private String titulo;
	private int id;
	private int cantidad;
	
	Registro(){
		
	}
	
	Registro(String titulo, int id, int cantidad){
		this.titulo = titulo;
		this.id = id;
		this.cantidad = cantidad;
	}
	
	//TITULO LIBRO
	 
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//ID LIBRO
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	//CANTIDAD LIBROS
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public void ejectuarAccion() {
		
		Registro registro = new Registro();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el titulo del libro: ");
		String titulo = sc.nextLine();
		
		System.out.println("Dime la referencia del libro: ");
		int id = sc.nextInt();
		
		System.out.println("Dime la cantidad de libros a añadir");
		int cantidad = sc.nextInt();
		
		System.out.println("Se han añadido " + cantidad + " libros a la colección");
		
	}
	
	
}
