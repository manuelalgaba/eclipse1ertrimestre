package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);		

		int positivo = 0;
		int negativo = 0;
		int nulo = 0;
		int pares = 0;
		int impares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Ingresa el número " + i + ": ");
			int numero = sc.nextInt();
			if (numero > 0) {
				positivo++;
			} else if (numero < 0) {
				negativo++;
			}else {
				nulo++;
			}
			if (numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		System.out.println("Números positivos: " + positivo);
		System.out.println("Números negativos: " + negativo);
		System.out.println("Números nulos: " + nulo);
		System.out.println("Números pares: " + pares);
		System.out.println("Números impares: " + impares);

		sc.close();
	}
}