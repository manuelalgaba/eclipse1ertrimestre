package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
        
		double[] numeros = new double[5];

        System.out.println("Ingrese 5 números decimales:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }
        System.out.println("Números ingresados:");

        for (double numero : numeros) {
            System.out.println(numero);
        }
        sc.close();
    }
}