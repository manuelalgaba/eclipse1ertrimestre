package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var sc = new Scanner(System.in);
		
		// Definir
		final double PI = 3.14159265;
		double area;
		double longitud;
		
		// Solicitar al usuario que ingrese el radio
		System.out.print("Radio: ");
		double radio = sc.nextDouble();
		
		// Realizar las operaciones
		area = PI * (radio*radio);
		longitud = PI * (radio * 2);
		
		System.out.println("Area: " + area);
		System.out.println("longitud: " + longitud);

	}

}
