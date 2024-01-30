package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

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
        int suma = 0;
        int resta = numeros[0];
        int multiplicacion = 1;
        double division = 1.0;

        for (int i = 0; i < tamaño; i++) {
            suma += numeros[i];
            if (i > 0) {
            	resta -= numeros[i];
                multiplicacion *= numeros[i];
                division /= numeros[i];
            }
        }
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
        
        sc.close();
	}
}