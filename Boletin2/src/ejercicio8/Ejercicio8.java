package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Número decimal: ");
		double num1 = sc.nextDouble();
		
		long num2 = Math.round(num1);
		
		System.out.print("Número redondeado: " + num2);

	}

}
