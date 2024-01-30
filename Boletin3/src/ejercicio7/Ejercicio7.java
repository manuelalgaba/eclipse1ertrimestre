package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca una nota: "); 
		double nota = sc.nextDouble();
		
		if (nota <= 10 && nota >= 0){
			if (nota <= 4.49)
				System.out.println("Insuficiente");
			else if (nota <= 5.49)
				System.out.println("Suficiente");
			else if (nota <= 6.49)
				System.out.println("Bien");
			else if (nota <= 8.49)
				System.out.println("Notable");
			else 
				System.out.println("Sobresaliente");
		}else
			System.out.println("Solo notas del 0 al 10");

		sc.close();

		


	}

}
