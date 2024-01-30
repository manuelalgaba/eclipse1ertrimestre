package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);		
		  
		  char letra = 0;
	      int contadorVocales=0;
	      
	      System.out.print("Introduce una letra: ");
          letra=sc.next().charAt(0);

	      while(letra!='z') {
	          if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
	        	  contadorVocales++;
	            }
	        }
	      System.out.println("Has escrito "+contadorVocales+" vocales");
	      sc.close();
	    }
	}