package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var sc = new Scanner(System.in);		
		
		int base = 0;
		int exponente = 0;
		int multiplica = 1;
		
		System.out.println("Escribe dos numeros enteros 1 la base y 2 el exponente");
		System.out.print("Escribe la base: ");
		base = sc.nextInt();
		System.out.print("Escribe el exponente: ");
		exponente= sc.nextInt();
		
		if(base>0 && exponente>0) {
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
	    sc.close();
	}
}