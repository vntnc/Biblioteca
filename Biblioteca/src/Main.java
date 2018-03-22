import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	static String nombreCliente;
	static String DNI;
	static String tituloLibro;
	static String nombreAutor;
	static int fechaLibro;
	static double precioLibro;
	
	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList clientes = new ArrayList();
		ArrayList libros = new ArrayList();
		
		 
	    Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    String opcion;
	
	    while (!salir) {
	
	    	System.out.println("------------------------------------------------------");
	        System.out.println("1. Añadir cliente");
	        System.out.println("2. Añadir Libro");
	        System.out.println("3. Mostrar clientes y libros");
	        System.out.println("4. Salir");
	    	System.out.println("------------------------------------------------------");

	
	        try {
	
	            System.out.println("Escribe una de las opciones");
	            opcion = sn.next();
	
	            switch (opcion) {
	                case "1":
	                    System.out.println("Has seleccionado la opcion 1");
	                    System.out.println("Introduce tu nombre de cliente: ");
	                      nombreCliente = sc.next();
	                      System.out.println("Introduce DNI de cliente: ");
	                      DNI = sc.next();
	                      Cliente cliente = new Cliente(nombreCliente,DNI);
	                      clientes.add(cliente);
	                      
	                      /*for(int i = 0; i<clientes.size();i++) {
	                    	 System.out.println(clientes.get(i));
	                    	  
	                      }*/
	                      
	                      System.out.println(nombreCliente +  " " + DNI);
	                      
	                    break;
	                case "2":
	                    System.out.println("Has seleccionado la opcion 2");
	                    System.out.println("Introduce el titulo del libro: ");
	                    tituloLibro = sc.nextLine();
	                    System.out.println("Introduce nombre de autor del libro: ");
	                    nombreAutor = sc.nextLine();
	                    System.out.println("Introduce fecha de libro: ");
	                    fechaLibro = sc.nextInt();
	                    System.out.println("Introduce precio del libro: ");
	                    precioLibro = sc.nextDouble();
	                      Libro libro = new Libro(tituloLibro,nombreAutor,fechaLibro,precioLibro);
	                      libros.add(libro);
	                    break;
	                case "3":
	                	
	                	//nombreCliente = "";
	                      //System.out.println("Introduce DNI de cliente: ");
	                     // DNI = sc.next();
	                     // cliente = new Cliente(nombreCliente,DNI);
	                      //clientes.add(cliente.getNombre()+" "+cliente.getDni());
	                	System.out.println("Clientes:");
	                	for(int i = 0; i<clientes.size();i++) {
	                    	 System.out.println(clientes.get(i));
	                    			 //+ cliente.toString());
	                    	 
	                    	 
	                      }
	                	
	                	System.out.println("Libros:");
	                	for(int i = 0; i<libros.size();i++) {
	                    	 System.out.println(libros.get(i));
	                    			 //+ cliente.toString());
	                    	 
	                    	 
	                      }
	                    break;
	                case "4":
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