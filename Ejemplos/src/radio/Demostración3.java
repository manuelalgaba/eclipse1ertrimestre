package radio;

import java.util.Scanner;

public class Demostración3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		int numero1 = (int)(Math.random()*10);
		int numero2 = (int)(Math.random()*10);
		
		System.out.println("¿Que es " + numero1 + " + " + numero2 + " ?");
		int numero3 = sc.nextInt();
		
		if (numero1 + numero2 == numero3)
			System.out.print("Es correcto");
		else if (numero1 + numero2 != numero3)
			System.out.print("Es incorrecto");
		
		sc.close();

		


	}

}
