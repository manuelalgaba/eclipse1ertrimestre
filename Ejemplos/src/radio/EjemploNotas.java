package radio;

import java.util.Scanner;

public class EjemploNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Escriba la nota: "); 
		int nota = sc.nextInt();
		int sumanotas = 0;
		int contador = 0;
		int notamin = nota;
		
		while (nota != -1){
			if (nota < notamin) {
				notamin = nota;
			}
			contador++;
			sumanotas = sumanotas + nota;
			System.out.println("Escriba la nota: "); 
			nota = sc.nextInt();
		}
		
		System.out.println("La nota minima es: " + notamin);
		contador--;
		int promedio = (sumanotas - notamin) / contador;
		System.out.println("La nota media es: " + promedio);
		
		sc.close();
				
		
		
		

	}

}
