import java.util.Scanner;

public class ActividadIfElseTarifa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edad;
        int tarifa = 0;

        do {

            System.out.println("\n Proporcioname tu edad: ");
            edad = sc.nextInt();

            System.out.println("Eres estudiante?: (true/false)");
            boolean esEstudiante = sc.nextBoolean();

            if (edad > 0 && edad <= 12) {

                tarifa = 50;
                System.out.println("Tu tarifa es de: " + tarifa);


            } else if (edad > 12 && edad <= 17) {

                if (esEstudiante == true) {
                    System.out.println("Eres estudiante");
                    tarifa = 60;
                    System.out.println("Tu tarifa es de: " + tarifa);
                } else {
                    System.out.println("No eres estudiante");
                    tarifa = 80;
                    System.out.println("Tu tarifa es de: " + tarifa);
                }

            } else if (edad >= 18 && edad <= 120) {

                if (esEstudiante == true) {
                    System.out.println("Eres estudiante");
                    tarifa = 90;
                    System.out.println("Tu tarifa es de: " + tarifa);
                } else {
                    System.out.println("No eres estudiante");
                    tarifa = 120;
                    System.out.println("Tu tarifa es de: " + tarifa);
                }

            }

        }while(edad >= 0 && edad <= 120);

        System.out.println("Edad invalida.");

        sc.close();
    }
}
