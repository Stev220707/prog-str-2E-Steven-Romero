import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShippingCalculator calc = new ShippingCalculator();

        double peso = leerDoubleEnRango(sc, "Ingrese peso (0.1 - 50.0 kg): ", 0.1, 50.0);
        int distancia = leerIntEnRango(sc, "Ingrese distancia (1 - 2000 km): ", 1, 2000);
        int servicio = leerIntEnRango(sc, "Tipo de servicio (1: Estándar, 2: Express): ", 1, 2);
        boolean remoto = leerBoolean(sc, "¿Es zona remota? (true/false): ");

        double subtotal = calc.calcularSubtotal(peso, distancia, servicio, remoto);
        double iva = calc.calcularIVA(subtotal);
        double total = calc.calcularTotal(subtotal, iva);

        imprimirTicket(servicio, peso, distancia, remoto, subtotal, iva, total);
    }


    public static double leerDoubleEnRango(Scanner sc, String msg, double min, double max) {
        double valor = 0;
        boolean valido = false;
        do {
            System.out.print(msg);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                if (valor >= min && valor <= max) valido = true;
                else System.out.println("Error: El valor debe estar entre " + min + " y " + max);
            } else {
                System.out.println("Error: ¡Debes ingresar un número, no letras!");
                sc.next();
            }
        } while (!valido);
        return valor;
    }

    public static int leerIntEnRango(Scanner sc, String msg, int min, int max) {
        int valor = 0;
        boolean valido = false;
        do {
            System.out.print(msg);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                if (valor >= min && valor <= max) valido = true;
                else System.out.println("Error: Rango inválido (" + min + "-" + max + ").");
            } else {
                System.out.println("Error: Ingresa un número entero, no letras.");
                sc.next(); // Limpia el búfer
            }
        } while (!valido);
        return valor;
    }

    public static boolean leerBoolean(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.next().toLowerCase();
            if (input.equals("true")) return true;
            if (input.equals("false")) return false;
            System.out.println("Error: Solo acepta 'true' o 'false'.");
        }
    }

    public static void imprimirTicket(int srv, double p, int d, boolean zr, double sub, double iva, double tot) {
        System.out.println("\n===============================");
        System.out.println("       TICKET DE ENVÍO");
        System.out.println("===============================");
        System.out.println("Servicio:    " + (srv == 1 ? "Estándar" : "Express"));
        System.out.println("Peso:        " + p + " kg");
        System.out.println("Distancia:   " + d + " km");
        System.out.println("Zona Remota: " + (zr ? "Sí" : "No"));
        System.out.println("-------------------------------");
        System.out.printf("Subtotal:    $%.2f\n", sub);
        System.out.printf("IVA (16%%):   $%.2f\n", iva);
        System.out.printf("TOTAL:       $%.2f\n", tot);
        System.out.println("===============================");
    }
}