package ejercicio8;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        char[] arrayrandom = new char[20];
        int contadora = 0;
        int contadore = 0;
        int contadori = 0;
        int contadoro = 0;
        int contadoru = 0;

        
        for (int i = 0; i < 20; i++) {
        	arrayrandom[i] = charaleatorio();
        	if (arrayrandom[i] == 'a' || arrayrandom[i] == 'A') {
        		contadora++;
        	}
        	else if (arrayrandom[i] == 'e' || arrayrandom[i] == 'E') {
        		contadore++;
        	}
        	else if (arrayrandom[i] == 'i' || arrayrandom[i] == 'I') {
        		contadori++;
        	}
        	else if (arrayrandom[i] == 'o' || arrayrandom[i] == 'O') {
        		contadoro++;
        	}
        	else if (arrayrandom[i] == 'u' || arrayrandom[i] == 'U') {
        		contadoru++;
        	}
        }
        System.out.println("Los 20 carácteres random son : " + Arrays.toString(arrayrandom));
        System.out.println("La letra A se repite : " + contadora + " veces");
        System.out.println("La letra E se repite : " + contadore + " veces");
        System.out.println("La letra I se repite : " + contadori + " veces");
        System.out.println("La letra O se repite : " + contadoro + " veces");
        System.out.println("La letra U se repite : " + contadoru + " veces");


	}
    public static char charaleatorio () {
    	Random random = new Random();
    	char[] caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    	int indiceAleatorio = random.nextInt(caracteres.length);
    	return caracteres[indiceAleatorio];
    }

}
