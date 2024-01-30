package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Jugador {
    String nombre;
    int dinero;

    public Jugador(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }
}

class Apuesta {
    Jugador jugador;
    int monto;
    int numero;

    public Apuesta(Jugador jugador, int monto, int numero) {
        this.jugador = jugador;
        this.monto = monto;
        this.numero = numero;
    }
}

public class JuegoRuleta {
    private static final int DINERO_INICIAL = 1000;

    private static List<Jugador> jugadores = new ArrayList<>();
    private static List<Apuesta> apuestas = new ArrayList<>();
    private static Random random = new Random();
    private static int numeroGanador;

    public static void main(String[] args) {
        seleccionarNumeroJugadores();
        mostrarEstadoInicial();

        do {
            realizarApuestas();
            girarRuleta();
            pagarApuestas();
            mostrarEstadoFinal();
        } while (algunJugadorConDinero());
    }

    private static void seleccionarNumeroJugadores() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de jugadores: ");
        int numJugadores = scanner.nextInt();

        for (int i = 1; i <= numJugadores; i++) {
            System.out.print("Nombre del jugador " + i + ": ");
            String nombre = scanner.next();
            Jugador jugador = new Jugador(nombre, DINERO_INICIAL);
            jugadores.add(jugador);
        }
    }

    private static void mostrarEstadoInicial() {
        System.out.println("------ Estado Inicial ------");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.nombre + ": $" + jugador.dinero);
        }
        System.out.println("----------------------------");
    }

    private static void realizarApuestas() {
        Scanner scanner = new Scanner(System.in);

        apuestas.clear(); // Limpiar las apuestas de la ronda anterior

        for (Jugador jugador : jugadores) {
            if (jugador.dinero > 0) {
                System.out.print(jugador.nombre + ", introduce tu apuesta ($0 para saltar): ");
                int monto = scanner.nextInt();

                if (monto > 0) {
                    System.out.print("Elige un número para apostar (1-36): ");
                    int numero = scanner.nextInt();

                    Apuesta apuesta = new Apuesta(jugador, monto, numero);
                    apuestas.add(apuesta);
                }
            }
        }
    }

    private static void girarRuleta() {
        numeroGanador = random.nextInt(36) + 1;
        System.out.println("¡La ruleta ha girado! El número ganador es: " + numeroGanador);
    }

    private static void pagarApuestas() {
        System.out.println("------ Resultados ------");
        for (Apuesta apuesta : apuestas) {
            if (apuesta.numero == numeroGanador) {
                apuesta.jugador.dinero += apuesta.monto * 36; // Pago 36 veces la apuesta
                System.out.println(apuesta.jugador.nombre + " ha ganado $" + (apuesta.monto * 36));
            } else {
                apuesta.jugador.dinero -= apuesta.monto;
                System.out.println(apuesta.jugador.nombre + " ha perdido $" + apuesta.monto);
            }
        }
        System.out.println("------------------------");
    }

    private static void mostrarEstadoFinal() {
        System.out.println("------ Estado Final ------");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.nombre + ": $" + jugador.dinero);
        }
        System.out.println("--------------------------");
    }

    private static boolean algunJugadorConDinero() {
        for (Jugador jugador : jugadores) {
            if (jugador.dinero > 0) {
                return true;
            }
        }
        System.out.println("¡Todos los jugadores están sin dinero! Fin del juego.");
        return false;
    }
}
