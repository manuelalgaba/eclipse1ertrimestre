package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;

		for (int i = 1; i <= 6; i++) {
            System.out.print("Introduzca la calificación del alumno " + i + ": ");
            int calificacion = sc.nextInt();
            
            if (calificacion > 4) {
            	contador1++;
            }else if (calificacion == 4) {
            	contador2++;
            }else
            	contador3++;
		}
        System.out.println("Existen " + contador1 + " aprobados");
        System.out.println("Existen " + contador2 + " condicionados");
        System.out.println("Existen " + contador3 + " suspensos");
        sc.close();
		}
	}

