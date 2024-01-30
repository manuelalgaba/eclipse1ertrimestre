package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
        boolean suspenso = false;

		for (int i = 1; i <= 5; i++) {
            System.out.print("Introduzca la calificación del alumno " + i + ": ");
            int calificacion = sc.nextInt();

            if (calificacion < 5) {
                suspenso = true;
            }
        }
        if (suspenso) {
            System.out.println("Hay al menos un suspenso.");
        } else {
            System.out.println("No hay suspensos.");
        }
        sc.close();
    }
	}
