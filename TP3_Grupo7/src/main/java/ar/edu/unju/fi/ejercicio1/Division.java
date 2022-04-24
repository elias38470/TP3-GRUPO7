package ar.edu.unju.fi.ejercicio1;

public class Division {
	
	public void division(int[] a, int[] b) {
		float cociente=0;
		for(int i=0;i<a.length;i++) {
			cociente=a[i]/b[i];
			System.out.println(a[i]+" / "+b[i]+" = "+cociente);
		}
	}

}
