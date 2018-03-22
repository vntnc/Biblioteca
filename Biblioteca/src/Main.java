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
					System.exit(0);
			default:
				System.out.println("Solo n�meros entre 1 y 4");
			}
			biblio.ejecutarAccion();
		} while (opcion != 0);

		/*
		 * Scanner sn = new Scanner(System.in); boolean salir = false; String opcion1;
		 * 
		 * while (!salir) {
		 * 
		 * System.out.println("------------------------------------------------------");
		 * System.out.println("1. A�adir cliente");
		 * System.out.println("2. A�adir Libro"); System.out.println("3. Salir");
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
		 * System.out.println("Solo n�meros entre 1 y 3");
		 * 
		 * } } catch (InputMismatchException e) {
		 * System.out.println("Debes insertar un n�mero"); sn.next(); } }
		 */

	}

	private static void muestraMenu() {
		Scanner sn = new Scanner(System.in);
		
		StringBuffer menu = new StringBuffer();

			System.out.println("------------------------------------------------------");
			System.out.println("1. A�adir cliente");
			System.out.println("2. A�adir Libro");
			System.out.println("3. Salir");
			System.out.println("------------------------------------------------------");
			
		System.out.println(menu.toString());
	}
}