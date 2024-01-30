package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Escriba un numero entero: "); 
		int numero = sc.nextInt();
		System.out.println("Escriba otro numero entero: "); 
		int numero2 = sc.nextInt();
		
		if (numero == numero2)
			System.out.println("Es igual");
			else
				System.out.println("Son distintos");
				if (numero > numero2)
					System.out.println("El primero numero es mas grande");
					else
						System.out.println("El segundo numero es mas grande");
		sc.close();
		


	}

}
