package radio;

import java.util.Scanner;

public class Demostración1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introduzca su edad: ");
		int numero = sc.nextInt();
		
		if (numero >= 18)
		System.out.println("Mayor de edad");
		
		if (numero <= 18)
			System.out.println("Menor de edad");
		
		sc.close();


	}

}
