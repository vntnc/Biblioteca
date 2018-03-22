import java.util.Scanner;

public class Cliente implements GestionBiblio{
	
	private String nombre;
	private String dni;
	
	Cliente(){
		
	}
	
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

	//Utilizamos el método de la interfaz
	@Override
	public void ejectuarAccion() {
		
		Cliente cliente = new Cliente();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Dime tu dni: ");
		String dni = sc.nextLine();
		
		System.out.println("Estado: añadido nuevo Cliente " + nombre + ", " + dni);
	}
	
}
