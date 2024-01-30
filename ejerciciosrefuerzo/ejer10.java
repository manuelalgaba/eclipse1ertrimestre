package ejerciciosrefuerzo;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int multiplo = 3;
		int num1 = 0;
		int resultado = 0;
		System.out.println("Escribe un número positivo");
		num1 = sc.nextInt();
		 
		boolean acierto = false;
		
		//Analiza si el número es mayor que "0"
		while(acierto== false) {
		
		if(num1>0) {
			 
			 //Suma los multiplos de 3  las veces que has señalado
			 for( int i = 1; i <= num1; i++) {
				 
			 resultado += i*multiplo;
				  
			 }
			 			 
			 System.out.println("La suma de los num1 primeros números múltiplos de 3 es: "+resultado);
			 
			 acierto = true;
		     
		      }

		 else {
			 System.out.println("Introduce un número positivo");
			 num1 = sc.nextInt();
		
		 }
		 }
		
		sc.close();
	}

}
