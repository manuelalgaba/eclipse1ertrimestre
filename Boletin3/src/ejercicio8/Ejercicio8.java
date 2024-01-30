package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca un dia: "); 
		int dia = sc.nextInt();
		System.out.println("Introduzca un mes: "); 
		int mes = sc.nextInt();
		System.out.println("Introduzca un año: "); 
		int año = sc.nextInt();
		
		if (año <= 2023 && año >= 1){
			if ((dia > 0 && dia <= 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
				System.out.println("Es correcto");
			else if ((dia > 0 && dia <= 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
				System.out.println("Es correcto");
			else if ((dia > 0 && dia <= 28) && (mes == 2))
				System.out.println("Es correcto");
			else
				System.out.println("Es incorrecto");
		}
		else
			System.out.println("Solo pueden ser años entre el 1 y el 2023");
		sc.close();

			
		

	}

}
