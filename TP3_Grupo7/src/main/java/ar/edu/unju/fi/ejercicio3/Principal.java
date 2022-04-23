package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arreglo = new double[5];

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Ingrese apellido: ");
		String apellido = entrada.nextLine();
		
		System.out.println("Ingrese libreta universitaria: ");
		int libreta = entrada.nextInt();
		
		System.out.println("Ingreso de calificaciones (5)");
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese nota: ");
			arreglo[i]=entrada.nextDouble();
		}
		System.out.println("################################");
		
		System.out.println("Alumno: "+nombre+" "+apellido);
		System.out.println("LU: "+libreta);
	
		
		Alumno promedio = new Alumno();
		System.out.println("Promedio: "+promedio.calcularPromedio(arreglo));
		
		Alumno notaMayor = new Alumno();
		System.out.println("Nota máxima: "+notaMayor.obtenerNotaMaxima(arreglo));
		
	}

}
