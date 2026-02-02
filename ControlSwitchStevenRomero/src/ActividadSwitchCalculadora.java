import java.util.Scanner;

public class ActividadSwitchCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");

        System.out.print("Elige una opcion: ");
        int opcion = sc.nextInt();

        double a, b, resultado;

        switch (opcion) {
            case 1:
                System.out.print("Ingresa a: ");
                a = sc.nextDouble();
                System.out.print("Ingresa b: ");
                b = sc.nextDouble();
                resultado = a + b;
                System.out.println("Operacion elegida: Sumar");
                System.out.println("Valores: " + a + " y " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                System.out.print("Ingresa a: ");
                a = sc.nextDouble();
                System.out.print("Ingresa b: ");
                b = sc.nextDouble();
                resultado = a - b;
                System.out.println("Operacion elegida: Restar");
                System.out.println("Valores: " + a + " y " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                System.out.print("Ingresa a: ");
                a = sc.nextDouble();
                System.out.print("Ingresa b: ");
                b = sc.nextDouble();
                resultado = a * b;
                System.out.println("Operacion elegida: Multiplicar");
                System.out.println("Valores: " + a + " y " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                System.out.print("Ingresa a: ");
                a = sc.nextDouble();
                System.out.print("Ingresa b: ");
                b = sc.nextDouble();
                System.out.println("Operacion elegida: Dividir");
                if (b == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    resultado = a / b;
                    System.out.println("Valores: " + a + " y " + b);
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}