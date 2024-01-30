package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		//definir
		
				double nota4;
				
				// Solicitar al usuario que ingrese NOTA 1 Y 2
				System.out.print("Nota 1: ");
				double nota1 = sc.nextDouble();
				System.out.print("Nota 2: ");
				double nota2 = sc.nextDouble();
				System.out.print("Nota 3: ");
				double nota3 = sc.nextDouble();
				// Realizar las operaciones
				nota4 = (nota1 + nota2 + nota3) / 3;
				
				System.out.print("Media: " + nota4);

	}

}
