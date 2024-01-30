package radio;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
				
		System.out.print("Introduzca un numero entero: ");
		int numero = sc.nextInt();
		
		if (numero % 5 == 0)
		System.out.println("Hi five");
		
		if (numero % 2 == 0)
		System.out.print("Hi even");
		

		sc.close();

	}

}
