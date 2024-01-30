package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
        System.out.println("Introduce números enteros (introduce 0 para finalizar):");
        int n1 = sc.nextInt();
        
        System.out.println("Su numero minimo es: " + minimo(n1) + " y se ha repetido " + contadormin(n1) + " veces y su numero maximo es " + maximo(n1) + " y se ha repetido " + contadormax(n1) + "veces");
        
        sc.close();
	}
	public static int minimo(int n1) {
		var sc = new Scanner(System.in);
		int minimo = 100;
		while (n1 != 0) {
			if(minimo > n1) {
				minimo = n1;
			}
			System.out.println("Introduce otro número entero: ");
			n1 = sc.nextInt();
		}
		return minimo;
	}
	public static int maximo(int n1) {
		var sc = new Scanner(System.in);
		int maximo = 0;
		while (n1 != 0) {
			if(maximo < n1) {
				maximo = n1;
			}
			System.out.println("Introduce otro número entero: ");
			n1 = sc.nextInt();
		}
		return maximo;
}
	public static int contadormin(int n1) {
		int contador = 0;
		while (n1 != 0) {
			if(minimo(n1) > n1) {
				contador++;
			}
		}
		return contador;
	}
	public static int contadormax(int n1) {
		int contador = 0;
		while (n1 != 0) {
			if(maximo(n1) > n1) {
				contador++;
			}
		}
		return contador;
	}
}
