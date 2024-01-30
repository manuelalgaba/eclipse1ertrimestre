package ejemplo4;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: "); 
		int num = sc.nextInt();
		int num2 = 0;
		
		while (num != num2) {
			num2++;
			System.out.println(num2);
		}
			sc.close();		
		
		
		
		

	}

}
