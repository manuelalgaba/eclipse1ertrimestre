package ejerciciosrefuerzo;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		  var sc = new Scanner(System.in);
		  
		  char letra = 0;
	      int contadorVocales=0;

	        //El bucle no termina hasta que no se introduce una (z)
	        while(letra!='z') {
	            
	        	System.out.print("Introduce una letra: ");
	            letra=sc.next().charAt(0);
	           
	         //Sumas cada vocal qué introduces y las agrupa
	         if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
	                contadorVocales++;
	            }
	        }
	        System.out.println("Has escrito "+contadorVocales+" vocales");
	        sc.close();

	    }

	}
