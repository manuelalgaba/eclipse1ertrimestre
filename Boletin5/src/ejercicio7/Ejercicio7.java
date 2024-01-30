package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
        int n1 = sc.nextInt();
        
        primos(n1);
        divisores(n1);
        
        sc.close();
	}
	public static boolean primos(int n1) {
		if (n1 <= 0) {
            return false;
        }
        for (int i = 2; i * i <= n1; i++) {
            if (n1 % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void divisores(int n1) {
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && primos(i)) {
                System.out.println("Un divisor primo es: "+ i);
            }
        }
	
	}
}