package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);

        System.out.print("Introduzca un número n: ");
        int n = sc.nextInt();
        
        for (int i = n; i > 0; i--) {
            for (int n2 = 0; n2 < i; n2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}