package Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		// Primero preguntamos si quiere iniciar el programa, como no se como añadir n o s lo sustituyo por los números 1 o 2.
		System.out.print("¿Quiere iniciar el programa? (1 = Si (S) / 2 = No (N)");
        int iniciar = sc.nextInt();
		
        // Introducimos el número con sus cifras una a una para separar cada cifra en una variable diferente.
        System.out.print("Introduzca La primera cifra del numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca La segunda cifra del numero: ");
        int n2 = sc.nextInt();
        System.out.print("Introduzca La tercera cifra del numero: ");
        int n3 = sc.nextInt();
        System.out.print("Introduzca La cuarta cifra del numero: ");
        int n4 = sc.nextInt();
        
        //Iniciamos un bucle donde se realice las operaciones y me muestre cual es mayor.
        while (iniciar == 1) {
        	if((n1 * n2) > (n3 * n4)) {
        		System.out.println("El producto de los 2 primeros números es mayor al producto de los 2 últimos");
        	}else if ((n1 * n2) < (n3 * n4)) {
        		System.out.println("El producto de los 2 primeros números es menor al producto de los 2 últimos");
        	}
        	System.out.print("¿Quiere iniciar el programa? (1 = Si (S) / 2 = No (N)");
            iniciar = sc.nextInt();
        }
        sc.close();
        
        		
        	}
        
        

	}


