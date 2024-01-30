package ejerciciosrefuerzo;

import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
	
		char seguir = 'y';
		
		System.out.println("Escribe dos numeros enteros 1 la base y 2 el exponente");
		

		//Al finalizar el programa se pregunta si se quiere hacer de nuevo introducciendo una 'y'
		while(seguir == 'y') {
			
			int base = 0;
			int exponente = 0;
			int multiplica = 1;
			
			System.out.print("Escribe la base: ");
			 base = sc.nextInt();
		   	 System.out.print("Escribe el exponente: ");
		 	 exponente= sc.nextInt();
			
		if(base>0 && exponente>0) {
		
		//Calcula las veces que se tiene que multiplicar la base 
		for (int i = 1;i <= exponente ; i++) {
			
			multiplica *= base;
		
		}
			
	}
		else {
			System.out.println("Error");
			
			System.out.println("Escribe números positivos");
			
			System.out.print("Escribe la base: ");
			base = sc.nextInt();
			
			System.out.print("Escribe el exponente: ");
			exponente= sc.nextInt();
		}
		
		System.out.println("La base es " +base+" Exponente es " +exponente+ " da como resultado: "+multiplica);
	    
		System.out.println("Deseas seguir 'y' si 'n' no");
		seguir = sc.next().charAt(0);

		}
		
		 sc.close();
	}

}


		

	