package ar.edu.unju.fi.ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int[] arregloInt = new int[10];
		Scanner scan = new Scanner(System.in);
		int num;
		boolean error = false;
		System.out.println("Ingresar 10 numeros");
		for(int i =0 ; i<=9;i++)
		{
			do {
				
				error=false;//reinicio del valor
				  try {
					System.out.println("ingrese el "+ (i+1) +"° "+"numero");
					num = scan.nextInt();
					arregloInt[i] = num;
				  }catch(InputMismatchException e)
				  {
					  System.out.println("Error debes ingresar solo enteros");
				      scan.nextLine();//si hay un error "limpiamos" el buffer
				      error=true;//error, por lo tanto volver a pedir el ingreso
				  }
			
			}while (error==true);
			
		}
		
		
		System.out.println("Resultado inverso");
		
		for(int i = 9; i>=0 ; i--)			
		{
			System.out.println(arregloInt[i]);
		}
		
		
		
	}

}
