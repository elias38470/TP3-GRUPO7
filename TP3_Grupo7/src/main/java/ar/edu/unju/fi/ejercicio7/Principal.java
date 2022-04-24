
package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		char resp = ' ';
		int numero;
		boolean band;
		ArrayList<String> lista = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			String ingreso;
			
			do
			{
			band=true;
			System.out.println("ingrese una fruta");
			ingreso = sc.next();
			for (int i=0 ; i <= ingreso.length()-1;i++)
			{
				if (ingreso.charAt(i)<64 || ingreso.charAt(i)>123)
				{
				  band = false;
				  
				}
			}
			if (band == false)
				System.out.println("solo debe ingresar texto");
			}while (band==false);

			lista.add( ingreso);
			
			System.out.print("Desea ingresar mas datos? (S/N) ");
			resp = sc.next().charAt(0);
		}while (resp != 'n' && resp != 'N' );
		
		System.out.println("frutas con indice par");
		for (int i=0;i<lista.size();i++) {
		      
			if ( i%2 == 0 )
			{
		      System.out.println(lista.get(i));
			} 
			}
		
		do
		{
			band=true;
		
		System.out.println("Ingresa un numero:");
		try 
		{
			numero = sc.nextInt();
			
		if (numero >= 0 && numero <= lista.size()-1)
		{
			lista.remove(numero);
			band = false;
			
		}else
		{
		System.out.println("el numero no esta dentro del rango que comprende a los índices del arrayList");
		}
		}catch(InputMismatchException e) {
			System.out.println("debe ingresar un numero "+ e.getMessage());
			sc.nextLine();
		}
		}while(band == true);
		System.out.println("Elemento eliminado");
		
		for (int i=0;i<lista.size();i++) {
		      
		      System.out.println(lista.get(i));
			}
		System.out.println("La lista contiene " + lista.size() + " elementos");
 	}

}
