package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("El segundo numero debe ser mayor al primero");
		System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        
        numeros(n1, n2);
        sc.close();
	}
	public static void numeros(int n1, int n2) {
		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) 
				System.out.println(i);
		}
			else{
				System.out.println("ERROR");
		}
	}
}	