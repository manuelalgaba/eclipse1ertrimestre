package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
        System.out.println("Ingrese el radio en cm: ");
        int radio = sc.nextInt();
        System.out.println("Ingrese la altura en cm: ");
        int altura = sc.nextInt();
        System.out.println("¿Quiere medir área o volumen? (1 = ÁREA // 2 = VOLUMEN");
        int n = sc.nextInt();
        
        
        numeros(n,radio, altura);
        sc.close();
	}
	public static void numeros(int n, int radio, int altura) {
		double pi = 3.14159265359;
		if (n == 1) {
			double area = ((2 * pi) * radio * (altura + radio));
			System.out.print("El area del cilindro es: " + area + " cm2");
		}
		else if (n == 2) {
			double volumen = (pi * (radio * radio) * altura);
			System.out.print("El volumen del cilindro es: " + volumen + " cm3");
		}
		else
			System.out.print("ERROR");

		}
}
