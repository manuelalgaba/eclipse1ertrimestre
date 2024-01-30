package ejercicio4array;

import java.util.Scanner;

public class Ejercicio4array {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
		
        System.out.println("Inserta una frase:");
        String frase = sc.nextLine();

        frase = frase.toLowerCase();// Convertimos la frase a minúsculas

        // creamos un array con 26 de tamaño
        int[] frecuenciaLetras = new int[26];

        // Recorrer la frase y contar la frecuencia de cada letra
        for (int i = 0; i < frase.length(); i++) {
        }
    }
}