import java.util.Scanner;

public class InputValidator {

    public int obtenerNumeroEntero(String mensaje, Scanner sc){
        int valor;
        while (true) {
            System.out.println(mensaje);
            if(sc.hasNextInt()){
                valor= sc.nextInt();
                if(valor>0){
                    return valor;
                }
                System.out.println("El numero ingresado no es valido (Solo numeros de 1 a n)");
            }else{
                System.out.println("El Dato ingresado no es numerico (Solo se aceptan numeros)");
                sc.nextLine();
            }
        }
    }
}