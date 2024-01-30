package ejerciciosrefuerzo;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		char letra;
		int contadorletras = 0;
		int contadorvocales = 0;
	    System.out.println("Introduce 100 letras");
		
		//Analiza las letras y si son vocales las agrupa
	    while(contadorletras<100) {		
		letra = sc.next().charAt(0);
		
		if (letra == 'a'|| letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u'){
		
		contadorvocales++;
			
		 }
		contadorletras++;
		 }
		
		System.out.println("de las 100 letras hay " +contadorvocales + " vocales");
		
		sc.close();
	}
}
		
		
	

	     