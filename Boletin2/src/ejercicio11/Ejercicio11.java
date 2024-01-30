package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.print("Base Imponible: ");
		double base = sc.nextDouble();
		
		double factura = (base * 0.21) + base;
		
		System.out.print("Total factura (IVA INCLUIDO) " + factura);
		
		sc.close();	

}
}
