package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		int alturamax = 0;
		int contador = 0;
		System.out.println("Introduzca el tamaño en cm (-1 para salir): "); 
		int altura = sc.nextInt();
		contador++;
		
		while (altura != -1) {
			if (altura > alturamax) {
				alturamax = altura;
			}
				System.out.println("Introduzca el tamaño en cm (-1 para salir): "); 
				altura = sc.nextInt();
				contador++;
		}
		
		System.out.println("Arbol más alto es: " + contador + " = " + alturamax);
		sc.close();

	}

}
