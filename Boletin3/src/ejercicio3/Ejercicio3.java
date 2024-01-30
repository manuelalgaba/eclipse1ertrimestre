package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Escriba un numero: "); 
		double numero = sc.nextDouble();
		
		if (numero > -1 && numero != 0 && numero < 1)
			System.out.println("Es casi-cero");
		else
			System.out.println("No es casi-cero");
		
		
		sc.close();


	}

}
