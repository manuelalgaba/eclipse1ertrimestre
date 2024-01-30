package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		Random r = new Random();
		int num1 = r.nextInt(50-0)+0;
		int num2 = r.nextInt(100-51)+51;
		System.out.println("Introduzca un numero entre " + num1 + " y " + num2 + " :"); 
		int num3 = sc.nextInt();
		boolean condicion = false;
		
		while (condicion == false) {
			if(num3 >= num1 && num3 <= num2) {
				condicion = true;
			}
			else {
				System.out.println("Introduzca un numero entre " + num1 + " y " + num2 + " :"); 
				num3 = sc.nextInt();
			}
				
		}
		System.out.println("¡Bien!");
		sc.close();
			

	}

}
