package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		// Primero ingresamos 2 numeros
		System.out.println("Ingrese dos numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        numeros(n1,n2);
        sc.close();
	}
	public static void numeros(int n1, int n2) {
		// En otro metodo generamos con un for la lista de los numeros.
		for(int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
	}
}
