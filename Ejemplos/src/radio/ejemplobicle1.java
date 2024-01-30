package radio;

import java.util.Scanner;

public class ejemplobicle1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		int num2 = (int) (Math.random() * 10);
		System.out.print("Introduzca numero: ");
		boolean acierto = false;
		int num1 = sc.nextInt();
		
		while (acierto == false)
			if (num1 == num2) {
				System.out.print("Acierto");
				acierto = true;
			}
			else {
				System.out.print("Introduzca numero: ");
				num1 = sc.nextInt();
			}
		sc.close();				
			}
	}





