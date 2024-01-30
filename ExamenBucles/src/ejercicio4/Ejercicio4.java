package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		// Introducimos ambos números
		System.out.println("Introduzca el primer número:");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo número:");
        int n2 = sc.nextInt();
        
        // Mostramos primero la frase para que se genere solo una vez y no una frase por cada numero que se genere
        System.out.println("Los números menores a " + n1 + " que no son divisibles por " + n2 + " son: ");
        
        // Generamos el bucle for para que analice todas las opciones y las muestre en pantalla
        for (int i = 1; i < n1; i++) {
        	if (i % n2 != 0) {
            	System.out.println(i);
	}
        }
        sc.close();

	}
}
