package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		//Introducimos la nota que sacamos
		System.out.println("Introduzca la nota que haya sacado: ");
        int nota = sc.nextInt();
         // Se crean las variables que vamos a necesitar
        int notaAlta = 0;
        int notaMedia = 0;
        int notaBaja = 10;
        int contador = 0;
        
        // Creamos el bucle en el cual se vaya registrando la nota mas alta, la nota mas baja y nos siga pidiendo mas notas
        while (nota >= 0 && nota <= 10) {
        	contador++;
        	notaMedia = notaMedia + nota;
        	if (nota > notaAlta) {
        		notaAlta = nota;
        	}
        	if (nota < notaBaja) {
        		notaBaja = nota;
        	}
        	System.out.println("Introduzca la nota que haya sacado: ");
            nota = sc.nextInt();
            }
        
        // Mostramos en pantalla lo que nos solicita el problema
        System.out.println("La nota mas alta que ha sacado es: " + notaAlta);
        System.out.println("La nota mas baja que ha sacado es: " + notaBaja);
        System.out.println("La nota media que ha sacado es: " + (notaMedia / contador));
        
        sc.close();
        }

	}

