package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

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
        int[] pares = construirTablaPares(numeros);
        int[] impares = construirTablaImpares(numeros);

        System.out.println("Tabla original:");
        mostrarTabla(numeros);
        System.out.println("Tabla de elementos pares:");
        mostrarTabla(pares);
        System.out.println("Tabla de elementos impares:");
        mostrarTabla(impares);
        
        sc.close();	}
	private static int[] construirTablaPares(int[] numeros) {
        int countPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                countPares++;
            }
        }
        
        int[] pares = new int[countPares];
        int index = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[index++] = numeros[i];
            }
        }
        return pares;
    }
    private static int[] construirTablaImpares(int[] numeros) {
        int countImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                countImpares++;
            }
        }
        int[] impares = new int[countImpares];
        int index = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                impares[index++] = numeros[i];
            }
        }
        return impares;
    }
    private static void mostrarTabla(int[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();
    }
}