package ej;

import java.util.Scanner;

public class Ej {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		// Ejemplos de métodos String
		System.out.println("---MÉTODOS STRING---");
        
        System.out.println("Introduce una cadena(minimo 15 caracteres): ");
        String cadena = sc.nextLine();
        
        int longitud = cadena.length();
        System.out.println("Longitud de la cadena: " + longitud);
		
        int posicion = cadena.charAt(4);
        System.out.println("El 4to caracter es: " + posicion);
        
        String subcadena1 = cadena.substring(0, 5);
        System.out.println("Subcadena 1: " + subcadena1);
        
        String subcadena2 = cadena.substring(6, 6);
        System.out.println("Subcadena 2: " + subcadena2);
        
        String subcadena3 = cadena.substring(7);
        System.out.println("Subcadena 3: " + subcadena3);
        
        String mayusculas = cadena.toUpperCase();
        System.out.println("En mayúsculas: " + mayusculas);
        String minusculas = cadena.toLowerCase();
        System.out.println("En minusculas: " + minusculas);
        
        System.out.println("Introduce otra cadena(minimo 15 caracteres): ");
        String cadena2 = sc.nextLine();
        
        String concatenada = cadena.concat(cadena2);
        System.out.println("Cadenas concatenadas: " + concatenada);
        
        boolean sonIgualesIgnorandoCase = cadena.equalsIgnoreCase(cadena2);
        System.out.println("¿Las cadenas son iguales (ignorando mayúsculas y minúsculas)? " + sonIgualesIgnorandoCase);
        
        String cadena3 = "Java es un lenguaje de programación, y Java es divertido.";
        System.out.println("Nueva frase: Java es un lenguaje de programación, y Java es divertido.");
        int primeraAparicion = cadena3.indexOf("Java");
        System.out.println("Primera aparición de 'Java': " + primeraAparicion);
        int ultimaAparicion = cadena3.lastIndexOf("Java");
        System.out.println("Última aparición de 'Java': " + ultimaAparicion);
        
        boolean comienzaConPrefijo = cadena3.startsWith("Java");
        System.out.println("¿Comienza con 'Java'? " + comienzaConPrefijo);
        boolean terminaConSufijo = cadena3.endsWith("divertido");
        System.out.println("¿Termina con 'divertido.'? " + terminaConSufijo);
        
        String sinEspacios = cadena3.trim();
        System.out.println("Original: '" + cadena3 + "'");
        System.out.println("Sin espacios: '" + sinEspacios + "'");
        
		// Ejemplos de métodos Math
		System.out.println("---MÉTODOS MATH---");
		
		System.out.println("Ingrese un numero: ");
        double n1 = sc.nextDouble();
        
        System.out.println("Valor absoluto de " + n1 + ": " + Math.abs(n1));
        
        System.out.println("Raíz cuadrada del número: " + Math.sqrt(n1));
        
        System.out.println("Ingrese otro numero: ");
        double n2 = sc.nextDouble();
        System.out.println(n1 + " elevado a " + n2 + " : " + Math.pow(n1, n2));
        
        System.out.println("Número aleatorio: " + Math.random());
        
        System.out.println("Número mas grande entre: " + n1 + " y " + n2 + " = " + Math.max(n1, n2));
        System.out.println("Número mas pequeño entre: " + n1 + " y " + n2 + " = " +Math.min(n1, n2));
        
		// Ejemplos de métodos Character
		System.out.println("---MÉTODOS CHARACTER---");
        
		System.out.println("Ingrese un carácter: ");
        char ch = sc.next().charAt(0);
        
        System.out.println(ch + " es un dígito: " + Character.isDigit(ch));
        
        System.out.println(ch + " es una letra: " + Character.isLetter(ch));
        
        System.out.println(ch + " es una letra mayuscula: " + Character.isUpperCase(ch));

        System.out.println(ch + " es una letra minuscula: " + Character.isLowerCase(ch));
        
        System.out.println(ch + " se convierte en mayuscula: " + Character.toUpperCase(ch));
        
        System.out.println(ch + " se convierte en minuscula: " + Character.toLowerCase(ch));
        
        System.out.println(ch + " se convierte en en una cadena de un solo carácter: " + Character.toString(ch));
                
        System.out.println(ch + " su valor numérico es: " + Character.getNumericValue(ch));
        
        sc.close();
	}

}
