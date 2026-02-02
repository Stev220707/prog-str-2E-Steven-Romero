import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1;
        int maxIntentos = 7;
        int intentosRealizados = 0;

        boolean adivino = false;

        int fueraDeRango = 0;
        int entradasInvalidas = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He pensado un número entre 1 y 100.");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinarlo.");

        while (intentosRealizados < maxIntentos && !adivino) {
            System.out.print("\nIntento " + (intentosRealizados + 1) + ": Ingresa tu número: ");

            try {
                int intento = sc.nextInt();
                intentosRealizados++;

                if (intento < 1 || intento > 100) {
                    System.out.println("¡Número inválido! Debe ser entre 1 y 100.");
                    fueraDeRango++;
                } else if (intento == numeroSecreto) {
                    adivino = true;
                    System.out.println("¡Ganaste! Adivinaste el número en " + intentosRealizados + " intentos.");
                } else if (intento < numeroSecreto) {
                    System.out.println("El número secreto es MAYOR.");
                } else {
                    System.out.println("El número secreto es MENOR.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no numérica. Pierdes este intento.");
                sc.next();
                entradasInvalidas++;
                intentosRealizados++;
            }
        }

        if (!adivino) {
            System.out.println("\n¡Perdiste! El número secreto era: " + numeroSecreto);
        }

        System.out.println("\n --- Resumen de errores ---");
        System.out.println("Entradas fuera de rango (1-100): " + fueraDeRango);
        System.out.println("Entradas no numéricas: " + entradasInvalidas);

        sc.close();

    }

}
