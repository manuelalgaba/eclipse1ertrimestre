package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca numero 1: "); 
		int numero1 = sc.nextInt();
		System.out.println("Introduzca numero 2: "); 
		int numero2 = sc.nextInt();
		System.out.println("Introduzca numero 3: "); 
		int numero3 = sc.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3)
			if (numero2 >= numero3)
				System.out.println("Los números ordenados de mayor a menor son: " + numero1 + ", " + numero2 + ", " + numero3);
			else 
				System.out.println("Los números ordenados de mayor a menor son: " + numero1 + ", " + numero3 + ", " + numero2);
		else if (numero2 >= numero1 && numero2 >= numero3)
			if (numero1 >= numero3)
				System.out.println("Los números ordenados de mayor a menor son: " + numero2 + ", " + numero1 + ", " + numero3);
			else 
				System.out.println("Los números ordenados de mayor a menor son: " + numero2 + ", " + numero3 + ", " + numero1);
		else 
			if (numero2 >= numero1)
				System.out.println("Los números ordenados de mayor a menor son: " + numero3 + ", " + numero2 + ", " + numero1);
			else 
				System.out.println("Los números ordenados de mayor a menor son: " + numero3 + ", " + numero1 + ", " + numero2);
		
		
		sc.close();


	}

}
