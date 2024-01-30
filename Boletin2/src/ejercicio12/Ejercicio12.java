package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Horas trabajadas: ");
		double horas = sc.nextDouble();
		
		double salario = horas * 12;
		
		System.out.print("Salario: " + salario);
		
		sc.close();	

	}

}
