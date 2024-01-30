package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
		//Introducimos la fase que queremos
		System.out.println("Introduce una frase: ");
        String c1 = sc.nextLine();
        sc.close();
        //Creamos las variables de las letras desde la a la z
        int contadora = 0;
        int contadorb = 0;
        int contadorc = 0;
        int contadord = 0;
        int contadore = 0;
        int contadorf = 0;
        int contadorg = 0;
        int contadorh = 0;
        int contadori = 0;
        int contadorj = 0;
        int contadork = 0;
        int contadorl = 0;
        int contadorm = 0;
        int contadorn = 0;
        int contadorñ = 0;
        int contadoro = 0;
        int contadorp = 0;
        int contadorq = 0;
        int contadorr = 0;
        int contadors = 0;
        int contadort = 0;
        int contadoru = 0;
        int contadorv = 0;
        int contadorw = 0;
        int contadorx = 0;
        int contadory = 0;
        int contadorz = 0;
        //Con un for vamos pasando por la frase y sumando a su respectivo contador con un if
        for (int i = 0; i < c1.length(); i++) {
            if (c1.charAt(i)== 'a' && c1.charAt(i)== 'A') {
            	contadora++;
            }
            else if(c1.charAt(i)== 'b' && c1.charAt(i)== 'B') {
            	contadorb++;
            }
            else if(c1.charAt(i)== 'c' && c1.charAt(i)== 'C') {
            	contadorc++;
            }
            else if(c1.charAt(i)== 'd' && c1.charAt(i)== 'D') {
            	contadord++;
            }
            else if(c1.charAt(i)== 'e' && c1.charAt(i)== 'E') {
            	contadore++;
            }
            else if(c1.charAt(i)== 'f' && c1.charAt(i)== 'F') {
            	contadorf++;
            }
            else if(c1.charAt(i)== 'g' && c1.charAt(i)== 'G') {
            	contadorg++;
            }
            else if(c1.charAt(i)== 'h' && c1.charAt(i)== 'H') {
            	contadorh++;
            }
            else if(c1.charAt(i)== 'i' && c1.charAt(i)== 'I') {
            	contadori++;
            }
            else if(c1.charAt(i)== 'j' && c1.charAt(i)== 'J') {
            	contadorj++;
            }
            else if(c1.charAt(i)== 'k' && c1.charAt(i)== 'K') {
            	contadork++;
            }
            else if(c1.charAt(i)== 'l' && c1.charAt(i)== 'L') {
            	contadorl++;
            }
            else if(c1.charAt(i)== 'm' && c1.charAt(i)== 'M') {
            	contadorm++;
            }
            else if(c1.charAt(i)== 'n' && c1.charAt(i)== 'N') {
            	contadorn++;
            }
            else if(c1.charAt(i)== 'ñ' && c1.charAt(i)== 'Ñ') {
            	contadorñ++;
            }
            else if(c1.charAt(i)== 'o' && c1.charAt(i)== 'O') {
            	contadoro++;
            }
            else if(c1.charAt(i)== 'p' && c1.charAt(i)== 'P') {
            	contadorp++;
            }
            else if(c1.charAt(i)== 'q' && c1.charAt(i)== 'Q') {
            	contadorq++;
            }
            else if(c1.charAt(i)== 'r' && c1.charAt(i)== 'R') {
            	contadorr++;
            }
            else if(c1.charAt(i)== 's' && c1.charAt(i)== 'S') {
            	contadors++;
            }
            else if(c1.charAt(i)== 't' && c1.charAt(i)== 'T') {
            	contadort++;
            }
            else if(c1.charAt(i)== 'u' && c1.charAt(i)== 'U') {
            	contadoru++;
            }
            else if(c1.charAt(i)== 'v' && c1.charAt(i)== 'V') {
            	contadorv++;
            }
            else if(c1.charAt(i)== 'w' && c1.charAt(i)== 'W') {
            	contadorw++;
            }
            else if(c1.charAt(i)== 'x' && c1.charAt(i)== 'X') {
            	contadorx++;
            }
            else if(c1.charAt(i)== 'y' && c1.charAt(i)== 'Y') {
            	contadory++;
            }
            else if(c1.charAt(i)== 'z' && c1.charAt(i)== 'Z') {
            	contadorz++;
            }
            //Imprimimos el resultado.
        }
		System.out.println("La letra A se repite" + contadora + "veces");
		System.out.println("La letra B se repite" + contadorb + "veces");
		System.out.println("La letra C se repite" + contadorc + "veces");
		System.out.println("La letra D se repite" + contadord + "veces");
		System.out.println("La letra E se repite" + contadore + "veces");
		System.out.println("La letra F se repite" + contadorf + "veces");
		System.out.println("La letra G se repite" + contadorg + "veces");
		System.out.println("La letra H se repite" + contadorh + "veces");
		System.out.println("La letra I se repite" + contadori + "veces");
		System.out.println("La letra J se repite" + contadorj + "veces");
		System.out.println("La letra K se repite" + contadork + "veces");
		System.out.println("La letra L se repite" + contadorl + "veces");
		System.out.println("La letra M se repite" + contadorm + "veces");
		System.out.println("La letra N se repite" + contadorn + "veces");
		System.out.println("La letra Ñ se repite" + contadorñ + "veces");
		System.out.println("La letra O se repite" + contadoro + "veces");
		System.out.println("La letra P se repite" + contadorp + "veces");
		System.out.println("La letra Q se repite" + contadorq + "veces");
		System.out.println("La letra R se repite" + contadorr + "veces");
		System.out.println("La letra S se repite" + contadors + "veces");
		System.out.println("La letra T se repite" + contadort + "veces");
		System.out.println("La letra U se repite" + contadoru + "veces");
		System.out.println("La letra V se repite" + contadorv + "veces");
		System.out.println("La letra W se repite" + contadorw + "veces");
		System.out.println("La letra X se repite" + contadorx + "veces");
		System.out.println("La letra Y se repite" + contadory + "veces");
		System.out.println("La letra Z se repite" + contadorz + "veces");
	}
}