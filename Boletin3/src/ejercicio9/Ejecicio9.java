package ejercicio9;

import java.util.Scanner;

public class Ejecicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		 System.out.println("Ingrese un número del 1 al 7:");
	     int numero = sc.nextInt();
	     int dia = numero;
	     
	     if (dia >= 0 && dia <= 7) {;
	     	System.out.print("El número " + numero + " corresponde a ");
	     
	     		 
	     	switch (numero) {
	    	case 1:
	    			System.out.println("Lunes");
	                break;
	    	case 2:
	    			System.out.println("Martes");
	                break;
	    	case 3:
	    			System.out.println("Miercoles");
	                break; 
	    	case 4:
	    			System.out.println("Jueves");
	                break;
	    	case 5:
	    			System.out.println("Viernes");
	                break;
	    	case 6:
	    			System.out.println("Sabado");
	                break;
	    	case 7:
	    			System.out.println("Domingo");
	                break;
	     	}   }
	     else
	    	 System.out.println("Error, solo numeros del 1 al 7");
	     sc.close();
	     
	    	 

	}

}
