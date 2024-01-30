package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce Mb: ");
		int mb = sc.nextInt();
		
		int kb = mb * 1024;
		
		System.out.println("Resultado en Kb: " + kb);
		
		System.out.print("Introduce en Kb: ");
		int kb2 = sc.nextInt();
		
		int mb2 = kb2 / 1024;
		
		System.out.print("Resultado en Mb: " + mb2);


	}

}
