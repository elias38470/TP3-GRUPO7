package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] multiplicandos = {0,1,2,3,4,5,6,7,8,9,10};
		int num =0;
		String strNum;
		Scanner teclado = new Scanner(System.in);
		String resp;
		do {
			do {
				System.out.println("ingrese un numero entero [1,9]");
				strNum = teclado.next();
				try {
					num = Integer.parseInt(strNum);
					if (num >0 && num<10) {
						for (int i=0;i<multiplicandos.length;i++) {
							System.out.println(num+"x"+multiplicandos[i]+"="+num*multiplicandos[i]);
						}
					}else {
						System.out.println("debe ingresar un numero entre [1,9]");
						num=0;
					}
					
				}catch(NumberFormatException e) {
					System.out.println("debe ingresar un numero entero " + e.getMessage());
					num =0;
				}
				
			}while(num == 0);
			System.out.println("Desea ingresar otro numero? Si/No");
			resp = teclado.next();
		}while("si".equals(resp) || "Si".equals(resp));
		System.out.println("Fin del programa");
	}

	}


