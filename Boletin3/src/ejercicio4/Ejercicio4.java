package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Horas trabajadas: "); 
		int horas = sc.nextInt();
		
		if (horas <= 40)
			System.out.println("Su salario es: " + (horas * 12) + " €");
		else
			System.out.println("Su salario es: " + ((40 * 12) + ((horas - 40) * 16)) + " €");
		
		sc.close();


	}

}
