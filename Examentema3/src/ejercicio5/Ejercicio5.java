package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		// Ingresar el numero de km recorrido y si es usuario vip o no
        System.out.print("Ingrese el nº de Km recorridos: ");
        double km = sc.nextDouble();
        System.out.print("¿Es usuario VIP? 1 = SI 2 = NO.");
        int vip = sc.nextInt();
        
        // Creamos la variable preciobase
        double preciobase = 0.0;
        
        // le damos un valor a preciobase sin el descuento del iva pero aplicando ya el descuento vip.
        if (vip == 1) {
        if (km <= 300)
        	preciobase = 190;
        else if (km <= 1000)
        	preciobase = ((200 + (km - 300) * 0.3) - ((200 + (km - 300) * 0.3) * 0.05));
        else if (km > 1000)
        	preciobase = ((410 + (km - 1000) * 0.15) - ((410 + (km - 1000) * 0.15) * 0.05));
        }
        if (vip == 2) {
        if (km <= 300)
        	preciobase = 200;
        else if (km <= 1000)
        	preciobase = (200 + ((km - 300) * 0.3));
        else if (km > 1000)
        	preciobase = (410 + ((km - 1000) * 0.15));
        }
        
        //Mostramos preciobase sin el IVA aplicado
        System.out.println("El precio base es: " + preciobase);
        
        //Mostramos con Iva aplicado
        System.out.print("Total es: " + (preciobase + (preciobase * 0.21)));
        
        sc.close();
        
        
        
        	

	}

}
