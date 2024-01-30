package examen4;

import java.util.Scanner;

public class Examen4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		 
		// Obtener el importe de compra y el dia de la semana
        System.out.print("Ingrese el importe de compra: ");
        double importe = sc.nextDouble();
        System.out.print("Ingrese el día de la semana (1 al 7): ");
        double dia = sc.nextDouble();
        
        // Mostrar que descueto se aplica y cual es el precio final despues de usar un if para identificar que descuento le pertenece a que dia.
        if (dia == 2 || dia == 4)
        	System.out.print("Se le aplica un descuento del 15% y el precio final es: " + (importe - (importe * 0.15)) + " €");
        else if (dia == 1 || dia == 3)
        	System.out.print("Se le aplica un descuento del 10% y el precio final es: " + (importe - (importe * 0.10)) + " €");
        else
        	System.out.print("Se le aplica un descuento del 5% y el precio final es: " + (importe - (importe * 0.05)) + " €");
        
        sc.close();


        	

	}

}
