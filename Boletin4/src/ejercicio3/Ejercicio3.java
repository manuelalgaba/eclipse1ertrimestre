package ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		Random random = new Random();
		boolean salir=false;
		int random2 = random.nextInt(100);
		System.out.println(random2); 
		System.out.println("Intenta acertar el número (-1 para finalizar.): "); 
		int num = sc.nextInt();
		
		
		while (num != -1 && salir==false) {
			if (random2 == num) {
				System.out.println("Acertó");
				salir=true;
			}
			else {
				if (random2 > num) {
				System.out.println("Es mas grande");
				}
				else {
					System.out.println("Es mas pequeño");
				}
				System.out.println("Intenta acertar el número (-1 para finalizar.): "); 
				num = sc.nextInt();
			}
		}
		sc.close();
		
				

	}

}
