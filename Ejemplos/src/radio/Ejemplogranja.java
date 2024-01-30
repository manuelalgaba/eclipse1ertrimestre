package radio;

import java.util.Scanner;

public class Ejemplogranja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("En que año nació: "); 
		int año = sc.nextInt();
		
		año = año % 12;
		
		switch (año) {
		case 0:
			System.out.println("El animal correspondiente al año " + año + " es monkey ");
            break;
		case 1:
			System.out.println("El animal correspondiente al año " + año + " es rooster ");
            break;
		case 2:
			System.out.println("El animal correspondiente al año " + año + " es dog ");
            break; 
		case 3:
			System.out.println("El animal correspondiente al año " + año + " es pig ");
            break;
		case 4:
			System.out.println("El animal correspondiente al año " + año + " es rat ");
            break;
		case 5:
			System.out.println("El animal correspondiente al año " + año + " es ox ");
            break;
		case 6:
			System.out.println("El animal correspondiente al año " + año + " es tiger ");
            break;
		case 7:
			System.out.println("El animal correspondiente al año " + año + " es rabbit ");
            break;
		case 8:
			System.out.println("El animal correspondiente al año " + año + " es dragon ");
            break;
		case 9:
			System.out.println("El animal correspondiente al año " + año + " es snake ");
            break;
		case 10:
			System.out.println("El animal correspondiente al año " + año + " es horse ");
            break;
		case 11:
			System.out.println("El animal correspondiente al año " + año + " es sheep ");
            break;
        		}
		
		sc.close();

	}

}
