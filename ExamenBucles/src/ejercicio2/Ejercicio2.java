package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		// Se introduce el sueldo y la antiguedad del operario
        System.out.print("Introduzca el sueldo: ");
        double sueldo = sc.nextDouble();
        System.out.print("Introduzca los años de antigüedad: ");
        int antiguedad = sc.nextInt();
        
        // Mediante un if identificamos el sueldo y añadomos el % que se añade
        if (sueldo < 1000) {
            if (antiguedad >= 10) {
                sueldo *= 1.20;
            } else {
                sueldo *= 1.05;
            }
        }
        //Finalmente se muestra el sueldo a recibir por parte del operario
        System.out.println("Sueldo a recibir: " + sueldo);

        sc.close();
    }


	}

