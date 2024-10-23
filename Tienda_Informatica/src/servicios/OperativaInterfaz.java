package servicios;

import java.util.ArrayList;
import dtos.ProductoDto;

/**
 * Interfaz para la operativa de la aplicación
 * @author rbr - 231024
 *
 */
public interface OperativaInterfaz {

	/**
	 * Enunciado de los métodos que tendrá la implementación
	 * rbr - 231024
	 */
	public ArrayList<ProductoDto> generarProductosAleatorios(int cantidad, ArrayList<ProductoDto> lista);
	public void mostrarProductos(ArrayList<ProductoDto> lista);
	public ArrayList<ProductoDto> comprarProducto(ArrayList<ProductoDto> lista);
	public ArrayList<ProductoDto> venderProducto(ArrayList<ProductoDto> lista);
}
