package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);		
		
		int multiplo = 3;
		int num1 = 0;
		int resultado = 0;
		
		System.out.println("Escribe un número positivo");
		num1 = sc.nextInt();
		boolean acierto = false;
		
		while(acierto== false) {
			if(num1>0) {
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