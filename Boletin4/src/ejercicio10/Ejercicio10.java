package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entre el 1 y el 10"); 
		int num = sc.nextInt();
		
		while (num >= 1 && num <= 10) {
			for (int i = 1; i <= 10; i++) {
	            int resultado = num * i;
	            System.out.println(num + " x " + i + " = " + resultado);
			}
			System.out.println("Introduzca un numero entre el 1 y el 10"); 
    		num = sc.nextInt();
		}
		sc.close();	

	}

}
