package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Nº de Hormigas: ");
		int h = sc.nextInt();
		
		System.out.print("Nº de Arañas: ");
		int a = sc.nextInt();
		
		System.out.print("Nº de Cochinillas: ");
		int c = sc.nextInt();
		
		int ph = (h * 6);
		int pa = a * 8;
		int pc = c * 14;
		
		System.out.println("Patas de Hormigas: " + ph);
		System.out.println("Patas de Arañas: " + pa);
		System.out.print("Patas de Cochinillas: " + pc);


	}

}
