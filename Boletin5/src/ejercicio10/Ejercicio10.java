package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
        int n1 = sc.nextInt();
               
        System.out.println(fibonacci(n1));
        
        sc.close();
	}
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}