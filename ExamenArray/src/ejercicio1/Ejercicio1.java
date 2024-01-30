package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		 var sc = new Scanner(System.in);

	        int[] numeros = new int[10];// Creamos el array

	        System.out.println("Introduzca 10 números enteros:");
	        for (int i = 0; i < 10; i++) {// Con el for vamos añadiendo los numeros enteros
	            System.out.println("Número " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	            if (numeros[i] == 0) {
	                break; // usamos break para salir del bucle si se ingresa 0
	            }
	        }
	        //Creamos las variables para las cuentas posteriores
	        double sumaPositivos = 0.0;
	        double sumaNegativos = 0.0;
	        int contadorPositivos = 0;
	        int contadorNegativos = 0;
	        //Mediante un for vamos realizando el paso uno a uno por los enteros del array
	        for (int i = 0; i < numeros.length; i++) {
	            if (numeros[i] > 0) {//Con un if identificamos los positivos 
	                sumaPositivos += numeros[i];
	                contadorPositivos++;
	            } else if (numeros[i] < 0) {//Con un if identificamos los negativos 
	                sumaNegativos += numeros[i];
	                contadorNegativos++;
	            }
	        }
	        //Con un if contabilizamos que exitan positivos, realizamos las operaciones e imprimimos.
	        if (contadorPositivos > 0) {
	            double mediaPositivos = sumaPositivos / contadorPositivos;
	            System.out.println("Media de números positivos: " + mediaPositivos);
	        } else {
	            System.out.println("No se ingresaron números positivos.");
	        }
	        //Con un if contabilizamos que exitan negativos, realizamos las operaciones e imprimimos.
	        if (contadorNegativos > 0) {
	            double mediaNegativos = sumaNegativos / contadorNegativos;
	            System.out.println("Media de números negativos: " + mediaNegativos);
	        } else {
	            System.out.println("No se ingresaron números negativos.");
	        }
	        sc.close();
	    }
	}