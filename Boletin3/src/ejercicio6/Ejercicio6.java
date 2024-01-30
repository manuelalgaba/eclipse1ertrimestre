package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca numero: "); 
		int numero = sc.nextInt();
		if (numero >= 0){
			if (numero <= 9)
				System.out.println("Una sola cifra.");
			else if (numero <= 99)
				System.out.println("Dos cifras.");
			else if (numero <= 999)
				System.out.println("Tres cifras.");
			else if (numero <= 9999)
				System.out.println("Cuatro cifras.");
			else if (numero <= 99999)
				System.out.println("cinco cifras.");
			else
			System.out.println("Nº mayor a 99999");
		}else
			System.out.println("Nº negativo");
		sc.close();

	}

}
