package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Escribe la edad (Un número negativo para finalizar.): "); 
		int edad = sc.nextInt();
		int contador = 0;
		int sumaedad = 0;
		int mayoredad = 0;
		System.out.println("Hay " + mayoredad + " mayores de edad.");
		
		while (edad >= 0) {	
			contador ++;
			sumaedad = sumaedad + edad;
			System.out.println("Escribe la edad (Un número negativo para finalizar.): "); 
			edad = sc.nextInt();
			if (edad >=18) {
			mayoredad++;
			System.out.println("Hay " + mayoredad + " mayores de edad.");
			}
			else {
			System.out.println("Sigue habiendo " + mayoredad + " mayores de edad.");
			}
			}
		
		System.out.println("La suma de todas las edades es: " + (sumaedad));
		System.out.println("La media de todas las edades es: " + (sumaedad / contador));
		System.out.println("El número de personas es: " + (contador));
		sc.close();
		
			

	}

}
