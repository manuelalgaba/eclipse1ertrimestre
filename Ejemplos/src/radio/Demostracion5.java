package radio;

import java.util.Scanner;

public class Demostracion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		int numero1 = (int)(Math.random()*10);
		int numero2 = (int)(Math.random()*10);
		
		
		if (numero1 <= numero2)
			System.out.print("ERROR");
		else {
			System.out.println("Cuanto es " + numero1 + " - " + numero2); 
			int numero3 = sc.nextInt();
		
			if (numero1 - numero2 == numero3)
				System.out.print("Es correcto");
			else
				System.out.print("Es incorrecto");}
		
		sc.close();
		



	}

}
