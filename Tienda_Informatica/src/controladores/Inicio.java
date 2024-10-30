/**
 * Rubén Bernal Ramos
 */

package controladores;

import java.util.ArrayList;
import java.util.Scanner;

import dtos.ProductoDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase controladora de la aplicación
 * @author rbr - 231024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 231024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		boolean cerrar = false;
		int cantidad = 24, opcion;
		ArrayList<ProductoDto> lista = new ArrayList<ProductoDto>();
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Instancias
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();

		lista = oi.generarProductosAleatorios(cantidad, lista);
		System.out.println("Bienvenido a Rubs Technology. Tu tienda de informática de confianza!!!");
		do {
			//Muestro el menú
			mi.mostrarMenu();
			opcion = sc.nextInt();
			//Accedo a la opción deseada por el usuario
			switch (opcion) {
			case 1:
				System.out.println("Ha seleccionado la opción para vender un producto.");
				oi.venderProducto(lista);
				break;
			case 2:
				System.out.println("Ha seleccionado la opción para comprar un producto.");
				oi.comprarProducto(lista);
				break;
			case 3:
				System.out.println("Ha seleccionado la opción para mostrar los productos de la tienda.");
				oi.mostrarProductos(lista);
				break;
			case 4:
				System.out.println("Cerrando aplicacón...");
				cerrar = true;
				System.out.println("Aplicación cerrada correctamente!!!");
				break;
			default:
				System.err.println("La opción seleccionada no es válida...");
				System.err.println("Inténtelo de nuevo...");
				break;
			}
		}while(!cerrar);
		
		sc.close();
	}
	
	
}
