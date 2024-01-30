package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var sc = new Scanner(System.in);
		
		//Definir
		int edad2;
		
		// Solicitar al usuario que ingrese nombre y edad
		System.out.print("Nombre: ");
		var nombre = sc.next();
		System.out.print("Edad: ");
		int edad = sc.nextInt();
		
		// Realizar las operaciones
		edad2 = edad + 1;
		
		System.out.println("Nombre= " + nombre);
		System.out.println("Edad=" + edad2);
		
		
		

	}

}
