package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
        
        String [] nombres = new String[30];
		System.out.println("Introduzca Los nombres de los 30 trabajadores:");
		for (int i = 0; i < 30; i++) {
            System.out.println("Nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
		}
        int [] horas = new int[30];
		System.out.println("Introduzca sus respectivas horas trabajadas:");
		for (int i = 0; i < 30; i++) {
            System.out.println("Horas del trabajador " + (i + 1) + ": ");
            horas[i] = sc.nextInt();
		}
		
		for (int i = 0; i < horas.length; i++) {
			horas[i] *= 20;
			System.out.println("El salario que perciben respectivamente del trabajador " + (i+1) + " es " + horas[i]);
		}
			
		int indiceMasGana = 0;
        for (int i = 1; i < horas.length; i++) {
            if (horas[i] > horas[indiceMasGana]) {
                indiceMasGana = i;
            }
        }
        int IndiceMenosGana = 0;
        for (int i = 1; i < horas.length; i++) {
            if (horas[i] < horas[IndiceMenosGana]) {
            	IndiceMenosGana = i;
            }
        }
        System.out.println("El salario más alto lo percibe: " + nombres[indiceMasGana]);
        System.out.println("El salario más bajo lo percibe: " + nombres[IndiceMenosGana]);
        
        sc.close();
    }
}
