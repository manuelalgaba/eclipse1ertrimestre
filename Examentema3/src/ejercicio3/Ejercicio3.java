package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		 
		// Con un scanner introducimos las 4 notas..
		
		System.out.println("Escriba la primera nota: "); 
		double nota1 = sc.nextDouble();
		System.out.println("Escriba la segunda nota: "); 
		double nota2 = sc.nextDouble();
		System.out.println("Escriba la tercera nota: "); 
		double nota3 = sc.nextDouble();
		System.out.println("Escriba la cuarta nota: "); 
		double nota4 = sc.nextDouble();
		
		// Eliminar la nota mas baja y hacer la media de las otras 3 y despues mostrarlo..
		
		if (nota1 < nota2 && nota1 < nota3 && nota1 < nota4)
			System.out.println("La media de sus notas es: " + ((nota2 + nota3 + nota4) / 3));
		else if (nota2 < nota1 && nota2 < nota3 && nota2 < nota4)
			System.out.println("La media de sus notas es: " + ((nota1 + nota3 + nota4) / 3));
		else if (nota3 < nota1 && nota3 < nota2 && nota3 < nota4)
			System.out.println("La media de sus notas es: " + ((nota2 + nota1 + nota4) / 3));
		else if (nota4 < nota1 && nota4 < nota2 && nota4 < nota3)
			System.out.println("La media de sus notas es: " + ((nota2 + nota3 + nota1) / 3));
		
		sc.close();
	

	}

}