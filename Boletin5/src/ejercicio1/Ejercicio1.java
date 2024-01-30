package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Ingrese el número de veces que desea imprimir el mensaje: ");
        int nrepe = sc.nextInt();
        
        eco(nrepe);
        
        sc.close();
	}
	  public static void eco(int nrepe) {
		  for (int i = 0; i < nrepe; i++) {
	            System.out.println("Eco...");
	        }
	  }
}
