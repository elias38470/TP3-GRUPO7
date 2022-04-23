package ar.edu.unju.fi.ejercicio9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		ArrayList<Producto> productos = new ArrayList();
		
		do {
			opcion = menu();
			switch(opcion) {
			case 1:	nuevoProducto(productos);
					
				break;
			case 2: if(productos.isEmpty()) {
						System.out.println("No hay productos que mostrar");
					}else {
						for (int i=0;i<productos.size();i++) {
							System.out.println(productos.get(i).toString());
						}
					}	
				break;
			case 3: if(productos.isEmpty()) {
						System.out.println("No hay productos que mostrar");
					}else {
						incrementarPrecio(productos);
						System.out.println("Se incrementaron los precios con 100,25 mas su valor");
					}
				break;
			case 4: if(productos.isEmpty()) {
						System.out.println("No hay productos que mostrar");
					}else {
						System.out.println("Monto Total de todos los productos = "+ montoTotal(productos));
					}
				break;
			case 5: System.out.println("Fin del programa..."); 
				break;
			default: System.out.println("Ingrese una opcion del muenu");	
			}
		}while(opcion !=5);
	}

	private static double montoTotal(ArrayList<Producto> productos) {
		// TODO Auto-generated method stub
		double suma=0;
		for(int i=0;i<productos.size();i++) {
			suma = suma + productos.get(i).getPrecio();
		}
		/* lo mismo pero usando FOR Mejorado
		 for(Producto p:productos) {
			suma=suma+ p.getPrecio();
		}*/
		
		return suma;
	}

	private static void incrementarPrecio(ArrayList<Producto> productos) {
		// TODO Auto-generated method stub
		for(Producto p:productos) {
			p.Incremento();
		}
	}

	private static void nuevoProducto(ArrayList<Producto> productos) {
		// TODO Auto-generated method stub
		int codigo=0; String descripcion=""; double precio=0; String marca="";
		boolean bandera = true;
		try {
			System.out.print("Codigo: ");
			codigo = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Descripcion: ");
			descripcion = teclado.nextLine();
			System.out.print("Precio: ");
			precio = teclado.nextDouble();
			teclado.nextLine();
			System.out.print("Marca: ");
			marca = teclado.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("error al ingresar codigo o precio.");
			System.out.println("Vueva a intentar");
			bandera = false;
			teclado.nextLine();
		}
		if(bandera == true) {
			Producto unProducto = new Producto(codigo, descripcion, precio, marca);
			productos.add(unProducto);
		}
	}

	private static int menu() {
		// TODO Auto-generated method stub
		int num =0;
		System.out.println();
		System.out.println("***** MENU *****");
		System.out.println("1- Nuevo producto");
		System.out.println("2- Mostrar los productos");
		System.out.println("3- Incrementar precio a todos los productos");
		System.out.println("4- Monto total de todos los productos");
		System.out.println("5- Fin");
		try {
			num = teclado.nextInt();
		}catch (Exception e) {
			teclado.next();
			System.out.println("Ingrese un numero entero del menu");
		}
		return num;
	}

	
}
