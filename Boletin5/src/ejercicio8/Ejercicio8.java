package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese un numero entero: ");
        int n2 = sc.nextInt();
        
        if (suma1(n1) == suma2(n2)) {
        	System.out.println("Son numeros amigos");
        }else
        	System.out.println("No son numeros amigos");
        
        sc.close();	
        }
	public static int suma1(int n1) {
	        int suma1 = 0;
	        for (int i = 1; i <= n1 / 2; i++) {
	            if (n1 % i == 0) {
	                suma1 += i;
	            }
	        }
	        return suma1;
	    }
	public static int suma2(int n2) {
        int suma2 = 0;
        for (int i = 1; i <= n2 / 2; i++) {
            if (n2 % i == 0) {
                suma2 += i;
            }
        }
        return suma2;
    }
	
}