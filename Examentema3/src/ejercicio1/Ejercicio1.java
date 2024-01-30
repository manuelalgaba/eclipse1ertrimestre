package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		// Primero generamos un numero aleatorio entre -100 y 100.
		int numrandom = (int) (Math.random() * 201) - 100;
		
		// Señalar que muestre en pantalla el número.
		System.out.println("El número es: " + numrandom);
		
		// Señalar que muestre si es positivo o negativo con IF.		
		if (numrandom >= 0)
			System.out.println("Es positivo");
		else
			System.out.println("Es negativo");
		
		//Señalar que marque si es multiplo de 3
		numrandom = numrandom % 3;
		
		// Señalar que muestre si es múltiplo de 3 o no.		
		if (numrandom == 0)
			System.out.println("Es múltiplo de 3");
		else
			System.out.println("No es múltiplo de 3");
		
		sc.close();
		
		
		
		


	}

}
