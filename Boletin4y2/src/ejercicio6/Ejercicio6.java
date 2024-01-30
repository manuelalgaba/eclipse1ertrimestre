package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var sc = new Scanner(System.in);		
		int suma = 0;
		double media = 0;
		int connumeros = 0;
		
		System.out.println("Introduce un número menor que 1 para salir)");
		boolean acierto = true;
		
		while (acierto == true) {
			int num1 = sc.nextInt();
			if (num1<1) {
				System.out.println();
				acierto = false;
			}
			else {			
				suma += num1;
				connumeros++;
		}

		}
		if (connumeros>1) {
			media = suma/connumeros;
			System.out.println("La media de los numeros es "+ media);
		 }
		else {
			System.out.println("Error");
		 }
		sc.close();
	}
}