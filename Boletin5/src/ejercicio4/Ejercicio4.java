package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Ingrese tres numeros enteros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        System.out.println("El numero mas grande es: " + maximo(n1,n2,n3));
        System.out.println("El numero mas pequeño es: " + minimo(n1,n2,n3));
        
        sc.close();
	}
	public static int maximo(int n1,int n2,int n3) {
		int maximo = 0;
		if (n1 > n2 && n1 > n3) {
			maximo = n1;
		}
		else if (n2 > n1 && n2 > n3) {
			maximo = n2;
		}
		else{
			maximo = n3;
		}
		return maximo;
	}
	public static int minimo(int n1,int n2,int n3) {
		int minimo = 0;
		if (n1 < n2 && n1 < n3) {
			minimo = n1;
		}
		else if (n2 < n1 && n2 < n3) {
			minimo = n2;
		}
		else{
			minimo = n3;
		}
		return minimo;
	}
}