package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		//Definir
		int edad;
		
		// Solicitar al usuario que ingrese nombre y edad
		System.out.print("Año de Nacimiento: ");
		int nacimiento = sc.nextInt();
		System.out.print("Año actual: ");
		int actual = sc.nextInt();
		
		// Realizar las operaciones
		edad = actual - nacimiento;
		
		System.out.println("Edad= " + edad);


	}

}
