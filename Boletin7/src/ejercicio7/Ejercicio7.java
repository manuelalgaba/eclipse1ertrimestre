package ejercicio7;

import java.util.Scanner;
import java.util.Arrays;


public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
		
		int [] numeros = new int[10];
		System.out.println("Introduzca sus 10 números favoritos:");
		for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
		}
		
		System.out.print("Ingrese el índice del elemento a eliminar (negativo para salir): ");
        int indice = sc.nextInt();

        while (indice >= 0 && indice < numeros.length) {
        	numeros = eliminarElemento(numeros, indice);
            System.out.println("Tabla actualizada: " + Arrays.toString(numeros));
            if (numeros.length > 0) {
                System.out.print("Ingrese el índice del próximo elemento a eliminar (negativo para salir): ");
                indice = sc.nextInt();
            } else {
                System.out.println("No quedan más elementos para eliminar.");
            }
        }
        sc.close();
    }
    private static int[] eliminarElemento(int[] numeros, int indice) {
        int[] newArray = new int[numeros.length - 1];

        // Copiar elementos antes del índice
        System.arraycopy(numeros, 0, newArray, 0, indice);

        // Copiar elementos después del índice
        System.arraycopy(numeros, indice + 1, newArray, indice, numeros.length - indice - 1);

        return newArray;
    }
}