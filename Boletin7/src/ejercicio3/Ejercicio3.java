package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
		
		System.out.print("Ingrese cuantos numeros desea introducir: ");
        int tamaño = sc.nextInt();
        int[] numeros = new int[tamaño];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("El orden inverso es:");
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }       
        sc.close();
	}
}