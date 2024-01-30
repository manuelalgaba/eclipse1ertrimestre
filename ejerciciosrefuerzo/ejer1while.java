package ejerciciosrefuerzo;

public class ejer1while {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 100;
				
		System.out.println("Los numeros entre 5 y 100 multiplos de 5 son:");

	    boolean acierto = false;

	    //Se ejecuta si el num1 es mayor que el num2 y se suman 5 hasta llegar al num2
		while (acierto == false) {

			if(num1 > num2) {

			acierto = true;

			}

			else {

				if(num1 <= num2) {

				System.out.println(num1);

			   	num1+=5;

				}
			}	
	    }	        
	}
}


