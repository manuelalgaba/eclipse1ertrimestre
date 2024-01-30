package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		// Definir
		double manzana = 2.35;
		double peras = 1.95;
		
		// mostrar
		System.out.print("1º Trimestre KG peras: ");
		double t1pera = sc.nextDouble();
		System.out.print("2º Trimestre KG peras: ");
		double t2pera = sc.nextDouble();
		System.out.print("3º Trimestre KG peras: ");
		double t3pera = sc.nextDouble();
		
		System.out.print("1º Trimestre KG manzanas: ");
		double t1manzana = sc.nextDouble();
		System.out.print("2º Trimestre KG manzanas: ");
		double t2manzana = sc.nextDouble();
		System.out.print("3º Trimestre KG manzanas: ");
		double t3manzana = sc.nextDouble();
		
		double beneficios = ((t1manzana + t2manzana + t3manzana) * manzana) + ((t1pera + t2pera + t3pera) * peras);
		
		System.out.print("Beneficios: " + beneficios + "€");
		
		

	}

}
