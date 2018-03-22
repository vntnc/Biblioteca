import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		// --------------------------------------------------------\\
		// 						PRUEBA STATE 					   \\
		// --------------------------------------------------------\\
		
		Biblioteca_gestor biblio = new Biblioteca_gestor();
		Cliente cliente = new Cliente();
		Libro libro = new Libro();
		Registro registro = new Registro();

		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		do {

			muestraMenu();
			opcion = sc.nextInt();
			switch (opcion) {
				case 1:
					//Le pasamos a la biblio el cliente
					biblio.setBiblio(cliente);
				break;
				case 2:
					//Le pasamos a la biblio el libro
					biblio.setBiblio(libro);
				break;
				case 3:
					//Le pasamos a la biblio el registro
					biblio.setBiblio(registro);
				break;
				case 4:
					System.exit(0);
				break;
			default:
				System.out.println("Solo números entre 1 y 4");
			}
			biblio.ejecutarAccion();
		} while (opcion != 0);

		/*
		 * Scanner sn = new Scanner(System.in); boolean salir = false; String opcion1;
		 * 
		 * while (!salir) {
		 * 
		 * System.out.println("------------------------------------------------------");
		 * System.out.println("1. Añadir cliente");
		 * System.out.println("2. Añadir Libro"); System.out.println("3. Salir");
		 * System.out.println("------------------------------------------------------");
		 * 
		 * 
		 * try {
		 * 
		 * 
		 * System.out.println("Escribe una de las opciones"); opcion1 = sn.next();
		 * 
		 * switch (opcion1) { case "1":
		 * System.out.println("Has seleccionado la opcion 1");
		 * 
		 * break; case "2": System.out.println("Has seleccionado la opcion 2"); break;
		 * case "3": salir = true; break; default:
		 * System.out.println("Solo números entre 1 y 3");
		 * 
		 * } } catch (InputMismatchException e) {
		 * System.out.println("Debes insertar un número"); sn.next(); } }
		 */

	}

	private static void muestraMenu() {
		Scanner sn = new Scanner(System.in);

			System.out.println("******************************************************\n");
			System.out.println("**************** 1. Añadir Cliente *******************\n");
			System.out.println("****************  2. Añadir Libro  *******************\n");
			System.out.println("**************** 3. Nuevo Ejemplar *******************\n");
			System.out.println("****************     4. Salir      *******************\n");
			System.out.println("******************************************************");
			
	}
}