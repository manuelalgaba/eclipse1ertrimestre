package ejercicio6;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
		
		int [] numeros = new int[5];
		
		for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
		}
		int[] numeros2 = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
        	numeros2[i] = numeros[i] * 2;
        }

        int[] numeros3 = new int[numeros.length + numeros2.length];
        System.arraycopy(numeros, 0, numeros3, 0, numeros.length);
        System.arraycopy(numeros2, 0, numeros3, numeros.length, numeros2.length);
        
        Arrays.sort(numeros3);
        System.out.println("Array ordenado de menor a mayor: " + Arrays.toString(numeros3));

        sc.close();
    }
}