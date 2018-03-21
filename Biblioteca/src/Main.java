import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String args []) {
		
		 
	    Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    String opcion;
	
	    while (!salir) {
	
	    	System.out.println("------------------------------------------------------");
	        System.out.println("1. Añadir cliente");
	        System.out.println("2. Añadir Libro");
	        System.out.println("3. Salir");
	    	System.out.println("------------------------------------------------------");

	
	        try {
	
	            System.out.println("Escribe una de las opciones");
	            opcion = sn.next();
	
	            switch (opcion) {
	                case "1":
	                    System.out.println("Has seleccionado la opcion 1");
	                    
	                    break;
	                case "2":
	                    System.out.println("Has seleccionado la opcion 2");
	                    break;
	                case "3":
	                    salir = true;
	                    break;
	                default:
	                    System.out.println("Solo números entre 1 y 3");
	                    
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Debes insertar un número");
	            sn.next();
	        }
	    }
	
	}
}