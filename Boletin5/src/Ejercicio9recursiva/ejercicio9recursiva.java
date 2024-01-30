package Ejercicio9recursiva;

import java.util.Scanner;

public class ejercicio9recursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Ingrese la base: ");
        double base = sc.nextInt();
        System.out.println("Ingrese el exponente(Mayor o igual a 0): ");
        int exponente = sc.nextInt();
        
        System.out.println(potencia(base, exponente));
        sc.close();
	}
	public static long potencia(double base, int e) {
		long resultado = 0;
		if(e == 0) {
			resultado = 1;
		}
		else {
			resultado = (long) (base *  potencia(base, e-1));
		}
		return resultado;
	}
	
}