package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int numeromax = 100;
        int [] numerosPrimos = obtenerPrimos(numeromax);

        System.out.println("Números primos entre 1 y 100 en orden ascendente:");
        for (int primo : numerosPrimos) {
            System.out.print(primo + " ");
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para obtener números primos hasta un límite superior
    public static int[] obtenerPrimos(int limite) {
        int[] primos = new int[limite]; // Suponemos que hay al menos tantos primos como números hasta el límite
        int contadorPrimos = 0;

        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                primos[contadorPrimos] = i;
                contadorPrimos++;
            }
        }

        // Crear un nuevo array con el tamaño exacto necesario
        int[] resultado = new int[contadorPrimos];
        System.arraycopy(primos, 0, resultado, 0, contadorPrimos);

        return resultado;
    }
}
