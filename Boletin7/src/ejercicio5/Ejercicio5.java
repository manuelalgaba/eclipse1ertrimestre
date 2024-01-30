package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
		
		System.out.print("Ingrese cuantos numeros desea introducir: ");
        int tamaño = sc.nextInt();
        int[] numeros = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        double sumaPositivos = 0.0;
        double sumaNegativos = 0.0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < tamaño; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }
        double mediaPositivos =sumaPositivos / contadorPositivos;
        double mediaNegativos =sumaNegativos / contadorNegativos;

        System.out.println("Media de números positivos: " + mediaPositivos);
        System.out.println("Media de números negativos: " + mediaNegativos);
        System.out.println("Número de ceros introducidos: " + contadorCeros);

        sc.close();
    }
}