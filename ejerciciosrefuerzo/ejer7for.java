package ejerciciosrefuerzo;

public class ejer7for {

	public static void main(String[] args) {
		
		int numero = 49;
		int par = 0;
		int impar = 0;
		
		
		//Analiza los numeros del 26 al 49 y los agrupa en pares e impares
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