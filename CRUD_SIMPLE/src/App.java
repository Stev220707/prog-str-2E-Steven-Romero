import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PersonaService service = new PersonaService();
        int opcion = -1;

        while(opcion != 0){
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Alta \n 2.Buscar \n 3.Baja \n 4. Listar \n 5. Actualizar \n 0. Salir");
            System.out.println("Opcion: ");
            try{
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                System.out.println("Mensaje: Opcion invalida.");
                continue;
            }

            switch (opcion){
                case 1:
                    System.out.print("ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();

                    if(InputValidator.esIdValido(id) && InputValidator.esNombreValido(nom) && !InputValidator.idRepetido(id, service.getPersonas(), service.getContador())){
                        service.alta(id, nom);
                    }else{
                        System.out.println("Error: Datos invalidos o ID repetido.");
                    }
                    break;

                case 2:
                    System.out.print("ID a buscar: ");
                    service.buscar(Integer.parseInt(sc.nextLine()));
                    break;
                case 3:
                    System.out.print("ID para baja: ");
                    service.bajaLogica(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    service.listar();
                    break;
                case 5:
                    System.out.print("ID a actualizar: ");
                    int idEdit = Integer.parseInt(sc.nextLine());
                    System.out.print("Nuevo nombre: ");
                    String nuevoNom = sc.nextLine();
                    if(InputValidator.esNombreValido((nuevoNom))){
                        service.actualizar(idEdit, nuevoNom);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida...");

            }


        }


    }


}