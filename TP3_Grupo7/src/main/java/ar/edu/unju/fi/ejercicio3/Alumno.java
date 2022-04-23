package ar.edu.unju.fi.ejercicio3;

import java.util.Arrays;

public class Alumno {

	public String nombre;
	public String apellido;
	public int lu;
	public double[] notas = new double[5];
	
	
	
	public Alumno() {
		super();
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", lu=" + lu + ", notas="
				+ Arrays.toString(notas) + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getLu() {
		return lu;
	}

	public void setLu(int lu) {
		this.lu = lu;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	public double calcularPromedio(double[] notas) {
		double suma=0;
		double prom=0;
		for(double valores:notas) {
			suma+=valores;
		}
		prom=suma/5;
		return prom;
	}
	
	public double obtenerNotaMaxima(double[] notas) {
		double max=0;
		for(double valor:notas) {
			if(max<valor) {
				max=valor;
			}
		}
		return max;
	}
	
}
