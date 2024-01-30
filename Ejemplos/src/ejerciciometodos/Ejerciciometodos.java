package ejerciciometodos;

public class Ejerciciometodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(resultado(1, 10));
		System.out.println(resultado(20, 30));
		System.out.println(resultado(35, 45));
	}
		public static int resultado(int i1, int i2) {
			int resultado = 0;
			for (int i = i1; i <= i2; i++) {
				resultado += i;
			}
			return resultado;
	}
}