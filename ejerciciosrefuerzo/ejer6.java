package ejerciciosrefuerzo;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int suma = 0;
		double media = 0;
		int connumeros = 0;
		
		System.out.println("Introduce un número menor que 1 para salir)");
				
		boolean acierto = true;
		
		
		//analiza el número y si es mayor que "0" se ejecuta
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
		
		 //si hay mas de un número mayor que 0 se ejecuta si no da error
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


