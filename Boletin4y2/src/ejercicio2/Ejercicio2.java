package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);		
		
		char caracter;
		int contadorcaracter = 0;
		int contadorvocales = 0;
	    
		System.out.println("Introduce 100 letras");
		caracter = sc.next().charAt(0);
		
	    while(contadorcaracter <= 100) {		
	    	if (caracter == 'a'|| caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u'){
	    		contadorvocales++;	
	    	}
	    	contadorcaracter++;
	    	}
		
		System.out.println("de las 100 letras hay " +contadorvocales + " vocales");
		
		sc.close();
	}
}