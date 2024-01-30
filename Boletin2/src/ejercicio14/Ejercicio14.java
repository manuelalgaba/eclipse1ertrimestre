package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce la nota del primer examen: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Que nota quieres sacar: ");
		double nota2 = sc.nextDouble();
		
		double nota3 = (((nota2) - (nota1 * 0.4)) / 0.6);
		
		System.out.print("Nota necesaria: " + nota3);


	}

}
