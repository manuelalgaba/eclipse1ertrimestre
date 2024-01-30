package ejerciciosrefuerzo;

public class ejer5 {

	public static void main(String[] args) {
		
		
		int suma = 0;
		int producto = 1;
		
		
		//introduce números del 1 al 7 para hacer su suma y  su producto
		for(int i= 1;i<=7;i++) {
			
			suma +=i;
			producto *=i;
		}

		System.out.println( "Suma de los primeros 7 numeros enteros: " +suma);
		System.out.println( "producto de los primeros 7 numeros enteros: " +producto);	
			

	}

}

