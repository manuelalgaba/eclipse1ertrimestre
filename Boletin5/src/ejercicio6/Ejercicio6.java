package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
        int n1 = sc.nextInt();
        
        primos(n1);
        System.out.println("El número " + n1 + " tiene " + divisores(n1) + " divisores primos.");
        
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
	public static int divisores(int n1) {
		int contador = 0;

        for (int i = 2; i <= n1; i++) {
            if (n1 % i == 0 && primos(i)) {
                contador++;
            }
        }
        return contador;
	}
}