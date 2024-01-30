package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: "); 
		int num = sc.nextInt();
		int contador = 0;
		int producto = 1;
		
		for (int i = num; contador < num; i--) {
			 producto *= i;
	            contador ++;
		}
		System.out.println(producto);
		sc.close();

			

	}

}
