package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;



public class Principal {
	 static Scanner teclado = new Scanner(System.in);
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Alumno> listaAlumnos= new ArrayList();
		int opcion;
		do {	
			opcion = menu();
			switch(opcion) {
			case 1:agregarAlumno(listaAlumnos);
				break;
			case 2:	if(listaAlumnos.isEmpty())
						System.out.println("La lista esta vacia. Agregue alumnos a la lista");
					else
						eliminarAlumno(listaAlumnos);
				break;
			case 3:	if(listaAlumnos.isEmpty())
						System.out.println("La lista esta vacia. Agregue alumnos a la lista");
					else
						modificarAlumno(listaAlumnos);
				break;
			case 4:	if(listaAlumnos.isEmpty())
						System.out.println("La lista esta vacia. Agregue alumnos a la lista");
					else { 
						System.out.println("*** Lista de Alumnos ***");
						for(int i=0;i<listaAlumnos.size();i++) {
							System.out.println(listaAlumnos.get(i).toString());
						}
					}	
					break;
			case 5:	if(listaAlumnos.isEmpty())
						System.out.println("La lista esta vacia. Agregue alumnos a la lista");
					else {	
						System.out.println("Alumnos que superan el promedio de 6");
						for(int i=0;i<listaAlumnos.size();i++) {
							if(listaAlumnos.get(i).calcularPromedio(listaAlumnos.get(i).notas)>=6)
								System.out.println(listaAlumnos.get(i).toString()+" Promedio = "+listaAlumnos.get(i).calcularPromedio(listaAlumnos.get(i).notas));
						}
					}	
					break;
			case 6:System.out.println("Fin del programa");
			break;
			default : System.out.println("Ingrese un numero de la lista.");
			}
		
		}while(opcion != 6);

	}

private static void modificarAlumno(ArrayList<Alumno> listaAlumnos) {
		
		System.out.println("ingrese LU");
		
		int lu = teclado.nextInt();
		for(Alumno a:listaAlumnos) {
			if(a.getLu()==lu){
				System.out.println("Ingrese notas del alumno");
				for(int i=0;i<5;i++) {
					listaAlumnos.get(listaAlumnos.indexOf(a)).getNotas()[i] = teclado.nextDouble();
				}
			}else System.out.println("No se encuentra un Alumno con ese LU");
		}
	}

	private static void eliminarAlumno(ArrayList<Alumno> listaAlumnos) {
		System.out.println("ingrese LU");
		boolean bandera = false;
		int num = teclado.nextInt();
		for(Alumno a:listaAlumnos) {
			if(a.getLu()==num){
				num = listaAlumnos.indexOf(a);
				bandera = true;
			}else System.out.println("no existe alumno con ese LU");	
		}	
		if (bandera == true)
			listaAlumnos.remove(num);
	}

	private static void agregarAlumno(ArrayList<Alumno> listaAlumnos) {
		Alumno alumno = new Alumno();
		System.out.println("ingrese nombre");
		alumno.setNombre(teclado.next());
		System.out.println("ingrese apellido");
		alumno.setApellido(teclado.next());
		System.out.println("ingrese LU");
		alumno.setLu(teclado.nextInt());
		System.out.println("Ingrese notas");
		double nota;
		for(int i =0;i<alumno.getNotas().length;i++) {
			System.out.print("nota <-- ");
			nota = teclado.nextDouble();
			if(nota>=0 && nota<=10) {	
				alumno.getNotas()[i] = nota;
			}else {
				System.out.println("ingrese notas del 0 al 10");
				i--;
			}
		}
		listaAlumnos.add(alumno);
	}

	public static int menu() {
		int num=0;
		System.out.println("****Menu****");
		System.out.println("1- Nuevo Alumno");
		System.out.println("2- Eliminar Alumno");
		System.out.println("3- Modificar notas del Alumno");
		System.out.println("4- Mostrar Lista de Alumnos");
		System.out.println("5- Mostrar Alumnos que superan promedio de 6");
		System.out.println("6- Salir");
		try {
			num = teclado.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Error...ingrese un numero entero "+ e.getMessage());
			teclado.next();
			num=0;
		}
		return num;
	}
}


