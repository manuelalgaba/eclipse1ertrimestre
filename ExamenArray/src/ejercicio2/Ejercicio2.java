package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
    	var sc = new Scanner(System.in);

        System.out.println("Inserte una frase:");//Insertamos la frase
        String frase = sc.nextLine();

        //Nos traemos el resultado de ambos métodos e imprimimos

        System.out.println("La frase está formada por " + contarPalabras(frase) + " palabras y " + contarPalabrasConA(frase) + " contienen a o A");

        sc.close();
    }
    public static int contarPalabras(String frase) {
        int contador = 0;// Añadimos 1 al contador para contar la última palabra
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isWhitespace(frase.charAt(i))) {//Utilizamos el metodo .iswhitespace para contabilizar los espacios
                contador++;
            }
        }
        return contador + 1;
    }
    public static int contarPalabrasConA(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isWhitespace(frase.charAt(i))) {
                continue; // utilizamos continue para saltar espacios en blanco
            }
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                contador++;
                // avanzar el indice hasta el final de la palabra
                while (i < frase.length() && !Character.isWhitespace(frase.charAt(i))) {
                    i++;
                }
            }
        }
        return contador;
    }
}