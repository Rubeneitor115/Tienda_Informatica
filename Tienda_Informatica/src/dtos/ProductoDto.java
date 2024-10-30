/**
 * Rubén Bernal Ramos
 */

package dtos;

/**
 * Clase de tipo ProductoDto para crear productos
 * @author rbr - 231024
 *
 */
public class ProductoDto {

	//Atributos
	String tipoProducto;
	String marca;
	String modelo;
	String color;
	int precio;
	String vida;
	boolean estado;
	
	//Getters y Setters
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getVida() {
		return vida;
	}
	public void setVida(String vida) {
		this.vida = vida;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//Constructores
	public ProductoDto(String tipoProducto, String marca, String modelo, String color, int precio, String vida,
			boolean estado) {
		super();
		this.tipoProducto = tipoProducto;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.vida = vida;
		this.estado = estado;
	}
	
	public ProductoDto() {
		
	}
		
	//Método toString
	public String toString() {
		return ("Tipo: " + this.tipoProducto +
				"  Marca: " + this.marca +
				"  Modelo: " + this.modelo + 
				"  Color: " + this.color + 
				"  Precio: " + this.precio + "€" + 
				"  Estado: " + this.vida + 
				"  En Stock: " + this.estado);
	}
}
