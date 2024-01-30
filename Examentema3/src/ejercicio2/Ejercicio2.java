package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		 
		// Con un scanner introducimos la temperatura.
		
		System.out.println("Escriba la temperatura en ºC: "); 
		int temperatura = sc.nextInt();
		
		// Mostrar en pantalla el tipo de clima con un if.
		if (temperatura >= -10 && temperatura <= 50 ){
			if (temperatura <= 10)
				System.out.println("Frio");
			else if (temperatura <= 20)
				System.out.println("Nublado");
			else if (temperatura <= 30)
				System.out.println("Caluroso");
			else if (temperatura > 30)
				System.out.println("Tropical");
		}
		else 
			System.out.println("Temperatura extrema");
		
		sc.close();

		


	}

}
