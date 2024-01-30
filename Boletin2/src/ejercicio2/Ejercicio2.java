package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var sc = new Scanner(System.in);
		
		// Definir
		double suma;
		double resta;
		double multiplicacion;
		double division;
		
		// Solicitar al usuario que ingrese el ambos numeros
		System.out.print("Numero 1: ");
		double numero1 = sc.nextDouble();
		System.out.print("Numero 2: ");
		double numero2 = sc.nextDouble();
		
		// Realizar las operaciones
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		division = numero1 / numero2;
		multiplicacion = numero1 * numero2;
		
		System.out.println("Suma= " + suma);
		System.out.println("Resta=" + resta);
		System.out.println("Multiplicación= " + multiplicacion);
		System.out.println("División: " + division);

	}

}
