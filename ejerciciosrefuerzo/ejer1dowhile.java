package ejerciciosrefuerzo;

public class ejer1dowhile {

	public static void main(String[] args) {
		
		System.out.println("Los numeros entre 5 y 100 multiplos de 5 son:");
		
		int num1 = 5;
		int num2 = 100;
		
		//Lee el primer número y despues ejecuta el while
		do {

		System.out.println(num1);

		num1+=5;

		}

		while(num1 <= num2);

     }

}
