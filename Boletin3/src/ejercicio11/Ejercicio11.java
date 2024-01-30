package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce la base imponible del producto: ");
        int base = sc.nextInt();
        System.out.print("Selecciona el tipo de IVA (1 - general (21%), 2 - reducido(10%) o 3 - superreducido(4%)): ");
        int iva = sc.nextInt();
        System.out.print("Introduce el código promocional (nopro - 1, mitad - 2, meno5 - 3 o 5porc - 4): ");
        int promo = sc.nextInt();
        
        double total = 0.0;
        
        
        switch (promo) {
        case 1:
			total = base;
            break;
        case 2:
			total = (base * 0.5);
            break;
        case 3:
			total = (base - 5);
            break;
        case 4:
			total = (base * 0.05);
            break;
        }
        switch (iva) {
        case 1:
			total = total + (total * 0.21);
            break;
        case 2:
			total = total + (total * 0.1);
            break;
        case 3:
			total = total + (total * 0.04);
            break;
        default: 
        	System.out.print("ERROR");
        }
        
        System.out.print("El precio total es: " + total + " €");
        
        sc.close();
        
        
        
         


	}

}
