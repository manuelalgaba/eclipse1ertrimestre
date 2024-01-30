package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		//Definir
		double nota3;
		
		// Solicitar al usuario que ingrese NOTA 1 Y 2
		System.out.print("Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();
		
		// Realizar las operaciones
		nota3 = (nota1 + nota2) / 2;
		
		System.out.print("Media: " + nota3);

	}

}
