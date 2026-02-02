import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        double grados_c = 0;
        double grados_f = 0;
        double km = 0;
        double millas = 0;

        int cant_grados_f = 0;
        int cant_grados_c = 0;
        int cant_millas = 0;
        int cant_kilometros = 0;
        int total = 0;

        do {
            System.out.println("\n Selecciona una opcion: \n 1) °C a °F \n 2) °F a °C \n 3) Kilometros a Millas \n 4) Millas a Kilometros \n 5) Salir \n \t");

            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida (debe ser numero)... ");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n Has seleccionado convertir °C a °F ");
                    System.out.println("Dame los grados °C ");

                    while (!sc.hasNextDouble()) {
                        System.out.println("Dato no numerico, intenta de nuevo: ");
                        sc.next();
                    }
                    grados_c = sc.nextDouble();

                    grados_f = ((grados_c * 1.8) + 32);
                    System.out.println("Los grados convertidos son: " + grados_f + "°F");

                    cant_grados_f++;
                    total++;
                    break;

                case 2:
                    System.out.println("\n Has seleccionado convertir °F a °C ");
                    System.out.println("Dame los grados °F ");

                    while (!sc.hasNextDouble()) {
                        System.out.println("Dato no numerico, intenta de nuevo: ");
                        sc.next();
                    }
                    grados_f = sc.nextDouble();

                    grados_c = ((grados_f - 32) / 1.8);
                    System.out.println("Los grados convertidos son: " + grados_c + "°C");

                    cant_grados_c++;
                    total++;
                    break;

                case 3:
                    System.out.println("\n Has seleccionado convertir Km a Millas ");
                    System.out.println("Dame los Km: ");

                    while (!sc.hasNextDouble()) {
                        System.out.println("Dato no numerico, intenta de nuevo: ");
                        sc.next();
                    }
                    km = sc.nextDouble();

                    millas = (km / 1.609);
                    System.out.println("Las millas convertidas es: " + millas);

                    cant_millas++;
                    total++;
                    break;

                case 4:
                    System.out.println("\n Has seleccionado convertir Millas a Kilometros ");
                    System.out.println("Dame los Kilometros: "); // Nota: Aquí pides Millas aunque el texto diga Kilometros

                    while (!sc.hasNextDouble()) {
                        System.out.println("Dato no numerico, intenta de nuevo: ");
                        sc.next();
                    }
                    millas = sc.nextDouble();

                    km = (millas * 1.609);
                    System.out.println("Los Kilometros convertidas son: " + km);

                    cant_kilometros++;
                    total++;
                    break;

                case 5:
                    System.out.println("\n Saliendo del programa...");
                    break;

                default:
                    System.out.println("\n Opcion no valida... ");
                    break;
            }

        } while (opcion != 5);

        System.out.println("\n--- RESUMEN FINAL ---");
        System.out.println("Total de conversiones: " + total);
        System.out.println("Conversiones C a F: " + cant_grados_f);
        System.out.println("Conversiones F a C: " + cant_grados_c);
        System.out.println("Conversiones Km a Millas: " + cant_millas);
        System.out.println("Conversiones Millas a Km: " + cant_kilometros);
    }
}