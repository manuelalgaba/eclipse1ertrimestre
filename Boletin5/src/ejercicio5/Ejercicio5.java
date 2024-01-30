package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce un caracter: ");
		char caracter = sc.next().charAt(0);
		vocales(caracter);		
		sc.close();
	}
	public static void vocales(char caracter) {
		if(caracter == 'a' | caracter == 'e' | caracter == 'i' | caracter == 'o' | caracter == 'u') {
			System.out.print("Es una vocal");
		}
		else
			System.out.print("No es una vocal");
	}
}
