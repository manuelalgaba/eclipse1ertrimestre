package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Ingrese su cargo: (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto)");
        int cargo = sc.nextInt();
        System.out.println("Ingrese cuantos dias ha estado visitando clientes");
        int dias = sc.nextInt();
        System.out.println("Estado civil 1 - Soltero 2 - Casado");
        int estado = sc.nextInt();
        
        
        double salariobase = 0.0;
        
        switch (cargo) {
        case 1:
        	salariobase = 950;
        	break;
        case 2:
        	salariobase = 1200;
        	break;
        case 3:
        	salariobase = 1600;
        	break;
        default:
            System.out.println("Cargo no válido");

        }
        
        double dietas = dias * 30;
        double salariobruto = salariobase + dietas;
        
        double irpf = 0.0;
        
        if (estado == 1) {
        	irpf = 0.25;
        }	else if (estado == 2) {
        	irpf = 0.2;}
        	else
                System.out.println("Estado civil no válido");
        
       double salarioneto = (salariobruto - (salariobruto * irpf));
       
       System.out.println("Nomina del empleado:");
       System.out.println("Sueldo Base: " + salariobase + " €");
       System.out.println("Dietas por dias de viaje: " + dietas + " €");
       System.out.println("Sueldo Bruto: " + salariobruto + " €");
       System.out.println("Sueldo Base: " + salariobase + " €");
       System.out.println("IRPF (" + estado + "(: " + (irpf * 100) + " %");
       System.out.println("Sueldo Neto: " + salarioneto + " €");
       
       sc.close();








        }

        
        
        
        


	}


