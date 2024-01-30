package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		//Primero Introducimos la marca del coche
		System.out.println("Introduzca la marca del coche (1 = Renault / 2 = Ford / 3 = Otro)");
        int marca = sc.nextInt();
        int modelo = 0; //Se declara la cariable del modelo del coche
        
        // Se crea un if para preguntar el modelo si marcamos que el coche es un ford
        if (marca == 2) {
        	System.out.println("Introduzca el del coche (1 = Focus / 2 = Fiesta)");
            modelo = sc.nextInt();
        }
        
        // Se crea un if en el que marcamos dependiendo de las preguntas anteriores que descuento nos pertenece
        if (marca == 1) {
        	System.out.println("Tiene un 15% de descuento");
        }else if (marca == 2 && modelo == 1) {
        	System.out.println("Tiene un 7% de descuento");
        }else if (marca == 2 && modelo == 2) {
        	System.out.println("Tiene un 10% de descuento");
        }else if (marca == 3) {
        	System.out.println("Tiene un 5% de descuento");
        }
        
        sc.close();
        

	}

	}

