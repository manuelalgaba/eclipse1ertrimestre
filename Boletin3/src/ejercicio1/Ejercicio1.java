package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Escriba un numero: "); 
		int numero = sc.nextInt();
		
		numero = numero % 2;
		
		if (numero == 0)
			System.out.print("Es par");
		else
			System.out.print("Es impar");
		
		
		
		sc.close();


		}

}
