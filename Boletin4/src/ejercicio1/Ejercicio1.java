package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero (el 0 es para finalizar): "); 
		int num = sc.nextInt();
		
		while (num != 0) {
			
			if (num % 2 == 0) {
				System.out.println("Es par");
			}
			else {
				System.out.println("Es impar");
			}
			
			
			if (num > 0) {
				System.out.println("Es positivo");
			}
			else {
				System.out.println("Es negativo");
			}
			
			System.out.println("El cuadrado del numero es: " + (num * num)); 
			
			System.out.println("Escribe un numero (el 0 es para finalizar): "); 
			num = sc.nextInt();
			}
		System.out.println("Hemos terminado");
		
		sc.close();
			
			

				
		}
		
	

	}


