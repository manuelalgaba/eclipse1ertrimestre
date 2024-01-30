package ejercicio9iterativa;

import java.util.Scanner;

public class Ejercicio9iterativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Introduce un numero para la base y otro para el exponente");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        iterativo(num1, num2);
        sc.close();
    }
    public static boolean iterativo(int num1, int num2) {
        int resultado = 1;
        if (num2 < 1) {
            System.out.println("EL exponente tiene que ser positivo");
            return false;
        } else {
            for (int i = 0; i < num2; i++) {
                resultado *= num1;
                System.out.println(resultado);
            }
        }
        return true;
    }
}