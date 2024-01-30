package ejerciciosrefuerzo;

public class ejer7while {

	public static void main(String[] args) {
		
		int par = 0;
		int impar = 0;
		int numero = 26;
		
		
		//Analizar los números del 26 al 49 y sumar todos los pares y todos los impares por otra parte
		while (numero<50) {
			
			if (numero % 2 == 0) {
				
				par += numero;
			}
		
			else {
				
				impar += numero;
			
			}
		    
		    numero++;
		    
		    }
		
		System.out.println("La suma de los número pares entre 25 y 50 es: " + par);
		System.out.println("La suma de los número impares entre 25 y 50 es: " + impar);
		
		
	  }

  }
