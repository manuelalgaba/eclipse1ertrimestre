package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma = 0;
		int producto = 1;
		
		for(int i= 1;i<=7;i++) {
			suma +=i;
			producto *=i;
		}
		System.out.println( "Suma de los primeros 7 numeros enteros: " +suma);
		System.out.println( "producto de los primeros 7 numeros enteros: " +producto);	
	}
}