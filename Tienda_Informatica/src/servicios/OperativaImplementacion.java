package servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import dtos.ProductoDto;

/**
 * Implementación de la interfaz Menu
 * @author rbr - 231024
 *
 */
public class OperativaImplementacion implements OperativaInterfaz{

	/**
	 * Método que creará una lista con productos aleatorios
	 * rbr - 231024
	 * @param cantidad
	 * @return lista
	 */
	public ArrayList<ProductoDto> generarProductosAleatorios(int cantidad, ArrayList<ProductoDto> lista) {
        
        Random random = new Random();

        List<String> tiposProducto = Arrays.asList("Movil", "Tablet", "Portatil", "PC");
        List<String> marcas = Arrays.asList("Apple", "Samsung", "Dell", "HP", "Lenovo", "Sony");
        List<String> colores = Arrays.asList("Negro", "Blanco", "Rojo", "Azul", "Gris", "Verde");
        List<String> modelos = Arrays.asList("A1", "Pro X", "Ultra", "G12", "Z3", "Max");
        List<String> vidas = Arrays.asList("Nuevo", "Seminuevo");

        for (int i = 0; i < cantidad; i++) {
            String tipoProducto = tiposProducto.get(random.nextInt(tiposProducto.size()));
            String marca = marcas.get(random.nextInt(marcas.size()));
            String modelo = modelos.get(random.nextInt(modelos.size()));
            String color = colores.get(random.nextInt(colores.size()));
            int precio = 100 + random.nextInt(901);
            String vida = vidas.get(random.nextInt(vidas.size()));
            boolean estado = random.nextBoolean();

            ProductoDto producto = new ProductoDto(tipoProducto, marca, modelo, color, precio, vida, estado);
            lista.add(producto);
        }

        return lista;
    }

	/**
	 * Método que mostrará la lista de los productos de la tienda
	 * rbr - 231024
	 */
	public void mostrarProductos(ArrayList<ProductoDto> lista) {
		
		int indice = 0;
		for(ProductoDto producto : lista) {
			System.out.println((indice + 1) + ". " + lista.get(indice));
			indice++;
		}
		
	}

	/**
	 * Método para comprar un producto de la tienda
	 * rbr - 231024
	 */
	public ArrayList<ProductoDto> comprarProducto(ArrayList<ProductoDto> lista) {
		
		//Variables
		int indice;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		mostrarProductos(lista);
		System.out.println("Introduzca el índice del producto que desea comprar: ");
		indice = sc.nextInt();
		
		if(indice>=1 && indice<=lista.size()) {
			ProductoDto producto = lista.get(indice - 1);
			if(producto.isEstado()==false) {
				System.err.println("El producto que desea comprar no tiene Stock actualmente...");
			}else {
				System.out.println("El producto ha sido comprado satisfactoriamente!!!");
				System.out.println("Pronto podrá recogerlo en tienda!!!");
				lista.remove(producto);
			}
		}else {
			System.err.println("Índice no válido");
		}
		
		return lista;
	}

	/**
	 * Método para vender un producto de la tienda
	 * rbr - 231024
	 */
	public ArrayList<ProductoDto> venderProducto(ArrayList<ProductoDto> lista) {
		
		ProductoDto producto = new ProductoDto();
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el tipo del producto (Movil, Tablet, Portatil o PC):");
		producto.setTipoProducto(sc.nextLine());
		System.out.println("Introduzca la marca del producto:");
		producto.setMarca(sc.nextLine());
		System.out.println("Introduzca el modelo del producto:");
		producto.setModelo(sc.nextLine());
		System.out.println("Introduzca el color del producto:");
		producto.setColor(sc.nextLine());
		System.out.println("Introduzca la cantidad por la que desea vender el producto:");
		producto.setPrecio(sc.nextInt());
		producto.setVida("seminuevo");
		producto.setEstado(true);
		
		lista.add(producto);
		
		System.out.println("Producto vendido correctamente!!!");
		System.out.println("Entreguelo en nuestra tienda para recibir el dinero!!!");
		
		
		return lista;
	}

}
