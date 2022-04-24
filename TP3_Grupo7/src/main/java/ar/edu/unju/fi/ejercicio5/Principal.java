package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese un texto");
		String cadena = scan.nextLine();
		//System.out.println(cadena.length());
		
		int cantElement = cadena.length();
		char[] arregloNum = new char[cantElement];
		
		for(int i = (cantElement - 1) , j = 0 ;i>=0;i-- , j++)
		{
			arregloNum[i] = cadena.charAt(j);
		}
		
		System.out.println("resultado inverso: ");
		for( int i = 0 ;i< cantElement;i++)
		{
			System.out.print( arregloNum[i] );
		}
		
		
	}
	
	
}
