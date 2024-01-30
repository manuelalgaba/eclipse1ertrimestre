package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Ingrese el día:");
        int dia = sc.nextInt();

        System.out.println("Ingrese el mes (en formato numérico, por ejemplo, enero es 1):");
        int mes = sc.nextInt();
        
        if ((dia <= 31 && dia >= 1) && (mes <= 12 && mes >= 1)){
        	if ((mes == 12 && dia >= 21) || (mes >= 1 && mes <= 2) || (mes == 3 && dia <= 20))
        		System.out.println("Es Invierno");
        	else if ((mes == 3 && dia >= 21) || (mes >= 4 && mes <= 6) || (mes == 6 && dia <= 20))
        		System.out.println("Es Primavera");
        	else if ((mes == 6 && dia >= 21) || (mes >= 7 && mes <= 9) || (mes == 9 && dia <= 20))
        		System.out.println("Es Verano");
        	else if ((mes == 9 && dia >= 21) || (mes >= 10 && mes <= 12) || (mes == 12 && dia <= 20))
        		System.out.println("Es Otoño");
        }
        else
    		System.out.println("Error");
        
        sc.close();


        		

	}

}
