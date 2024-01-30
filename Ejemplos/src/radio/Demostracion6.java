package radio;

import java.util.Scanner;

public class Demostracion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		
		System.out.print("Peso en Kg:");
		double peso = sc.nextDouble();
		System.out.print("Altura en M: ");
		double altura = sc.nextDouble();
		
		double imc = (peso / (altura * altura)); 
		
		if (imc < 18.5)
			System.out.print("Bajo de peso");
		else if
			(imc < 25.0)
			System.out.print("Normal");
		else if (imc < 30.0)
			System.out.print("Sobrepeso");
		else if
			(30.0 <= imc)
			System.out.print("Obeso");
		
		sc.close();
		



	}

}
