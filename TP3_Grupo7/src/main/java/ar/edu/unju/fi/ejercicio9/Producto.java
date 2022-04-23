package ar.edu.unju.fi.ejercicio9;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precio;
	private String marca;
	
	
	public Producto(int codigo, String descripcion, double precio, String marca) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}

	public void Incremento() {
		precio = precio +100.25;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", marca=" + marca
				+ "]";
	}

	public double getPrecio() {
		return precio;
	}


	
	
}
