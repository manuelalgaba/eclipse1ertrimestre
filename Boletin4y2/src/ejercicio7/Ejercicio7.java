package ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 49;
		int par = 0;
		int impar = 0;
		
		for (int i = 26; i <= numero ;i++) {
			if(i % 2 == 0) {
				par += i;
			}
			else {
				impar += i;
			}		
		}
		System.out.println("La suma de los número pares entre 25 y 50 es: " + par);
		System.out.println("La suma de los número impares entre 25 y 50 es: " + impar);
	}
}