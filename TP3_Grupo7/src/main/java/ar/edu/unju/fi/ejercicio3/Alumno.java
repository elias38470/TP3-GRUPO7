package ar.edu.unju.fi.ejercicio3;

public class Alumno {

	String nombre;
	String apellido;
	int lu;
	double[] notas = new double[5];
	
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
