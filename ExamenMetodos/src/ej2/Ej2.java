package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		// Primero declaramos los 2 numeros con los que queremos realizar la operación, para posteriormente elegir que operacion realizar.
		System.out.println("Ingrese un numero: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese un numero: ");
        int n2 = sc.nextInt();
        System.out.println("¿Que funcion desea realizar? (1 = SUMA / 2 = RESTA / 3 = MULTIPLICACIÓN / 4 = DIVISION");
        int n3 = sc.nextInt();
        
        // Luego declaramos las variables que me voy a llevar al metodo (calculadora)
        calculadora(n1,n2,n3);
        
        sc.close();
	}
	public static void calculadora(int n1, int n2, int n3) {
		// Declaramos la variable resultado y mediante un if elegimos que operacion vamos a realizar e imprimimos el resultado total.
		int resultado;
		if (n3 == 1) {
			resultado = n1 + n2;
			System.out.println("La suma de " + n1 + " + " + n2 + " es igual a " + resultado);
		}
		else if(n3 == 2) {
			resultado = n1 - n2;
			System.out.println("La resta de " + n1 + " - " + n2 + " es igual a " + resultado);
		}
		else if(n3 == 3) {
			resultado = n1 * n2;
			System.out.println("La multiplicación de " + n1 + " * " + n2 + " es igual a " + resultado);
		}
		else {
			resultado = n1 / n2;
			System.out.println("La división de " + n1 + " / " + n2 + " es igual a " + resultado);
		}
		}
		
}
