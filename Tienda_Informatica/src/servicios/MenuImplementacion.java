package servicios;

/**
 * Implementación de la interfaz Menu
 * @author rbr - 231024
 *
 */
public class MenuImplementacion implements MenuInterfaz{

	/**
	 * Método que mostrára el menú por consola
	 * rbr - 231024
	 */
	public void mostrarMenu() {
		
		System.out.println("=================================================");
		System.out.println("|                     MENÚ                      |");
		System.out.println("=================================================");
		System.out.println("|1. Vender producto.                            |");
		System.out.println("|2. Comprar producto.                           |");
		System.out.println("|3. Mostrar la lista de productos.              |");
		System.out.println("|4. Cerrar aplicación.                          |");
		System.out.println("=================================================");
		System.out.println("Seleccione la opción que desee:");
		
	}

}
