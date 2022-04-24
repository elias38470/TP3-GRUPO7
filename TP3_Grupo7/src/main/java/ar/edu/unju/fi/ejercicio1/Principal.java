package ar.edu.unju.fi.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglo1 = new int[5];
		int[] arreglo2 = new int[5];
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Ingresando valores para el 1er arreglo");
			for(int i=0;i<arreglo1.length;i++) {
				System.out.println("Ingrese un valor: ");
				arreglo1[i]=entrada.nextInt();
			}
			System.out.println("Ingresando valores para el 2do arreglo");
			for(int i=0;i<arreglo2.length;i++) {
				System.out.println("Ingrese un valor: ");
				arreglo2[i]=entrada.nextInt();
			}
			
			System.out.println("Iniciando division...");
			
			Division calculo = new Division();
			try {
				calculo.division(arreglo1, arreglo2);
			}catch(ArithmeticException ae) {
				System.out.println("Error, division por cero");
			}
			
		}catch(InputMismatchException me) {
			System.out.println("Debe ingresar un numero entero");
		}
	}
}
