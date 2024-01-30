package ejercicio7;

public class Ejercicio72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int par = 0;
		int impar = 0;
		int numero = 26;
		
		while (numero<50) {
			if (numero % 2 == 0) {
				par += numero;
			}
			else {
				impar += numero;
			}
		    numero++;
		    }
		System.out.println("La suma de los número pares entre 25 y 50 es: " + par);
		System.out.println("La suma de los número impares entre 25 y 50 es: " + impar);
	  }
  }