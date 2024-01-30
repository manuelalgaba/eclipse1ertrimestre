package radio;

import java.util.Scanner;

public class Demostracion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Numero 2: ");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2)
			System.out.println(numero1 + " es mayor que " + numero2);
		else if (numero1 < numero2)
			System.out.println(numero2 + " es mayor que " + numero1);
		else if (numero1 == numero2)
			System.out.println("Ambos son iguales");
		
		sc.close();


	}

}
