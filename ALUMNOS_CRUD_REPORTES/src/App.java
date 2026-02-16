import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AlumnoService service = new AlumnoService();
        int op = -1;

        while (op != 0) {
            System.out.println("\n--- MENU ESCOLAR ---");
            System.out.println("1) Alta\n2) Buscar\n3) Actualizar Promedio\n4) Baja\n5) Listar\n6) Reportes\n0) Salir");
            System.out.print("Opcion: ");

            try {
                op = Integer.parseInt(entrada.nextLine());

                switch (op) {
                    case 1:
                        System.out.print("ID: "); int id = Integer.parseInt(entrada.nextLine());
                        System.out.print("Nombre: "); String nom = entrada.nextLine();
                        System.out.print("Promedio: "); double pr = Double.parseDouble(entrada.nextLine());

                        if (InputValidator.esValido(id, nom, pr, service.getAlumnos(), service.getContador())) {
                            service.alta(id, nom, pr);
                        } else {
                            System.out.println("Error: Datos invalidos o ID repetido.");
                        }
                        break;
                    case 2:
                        System.out.print("ID a buscar: ");
                        service.buscar(Integer.parseInt(entrada.nextLine()));
                        break;
                    case 3:
                        System.out.print("ID: "); int idAct = Integer.parseInt(entrada.nextLine());
                        System.out.print("Nuevo promedio: "); double np = Double.parseDouble(entrada.nextLine());
                        if (np >= 0 && np <= 10) service.actualizarPromedio(idAct, np);
                        break;
                    case 4:
                        System.out.print("ID para baja logica: ");
                        service.bajaLogica(Integer.parseInt(entrada.nextLine()));
                        break;
                    case 5:
                        service.listarActivos();
                        break;
                    case 6:
                        service.generarReportes();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Dato no valido, intente de nuevo.");
            }
        }
    }
}