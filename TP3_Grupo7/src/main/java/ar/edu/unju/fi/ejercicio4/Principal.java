package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] arreglo = new int[8];
		int i=0,num,cont=0;
		String ingreso;
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese 8 numeros enteros");
		do
		{
			ingreso = sc.next();
			try {
				num = Integer.parseInt(ingreso);
				arreglo[i] = num;
				i++;
				cont++;
				}catch(NumberFormatException e) {
					System.out.println("debe ingresar solo numeros enteros " + e.getMessage());
					System.out.println("ingrese numeros enteros:");
		}
		}while (cont != 8);
	
		for (int j=0;j<=arreglo.length-1;j++) {
			if (arreglo[j]%2  == 0) {
				System.out.println(arreglo[j] + " par");
			}else {
				System.out.println(arreglo[j] + " impar");
			}
		}
		
	}

}
  