package radio;

import java.util.Scanner;

public class Demostracion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Nota: ");
		double nota = sc.nextDouble();
		
		if (nota < 5)
			System.out.print("Suspenso");
		else if (nota <  6)
			System.out.print("Suficiente");
		else if (nota <  7)
			System.out.print("Bien");
		else if (nota <  9)
			System.out.print("Notable");
		else
			System.out.print("Sobresaliente");
		
		sc.close();

		


	}

}
