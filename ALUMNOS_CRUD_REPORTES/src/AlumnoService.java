public class AlumnoService {
    private Alumno[] alumnos = new Alumno[25];
    private int contador = 0;

    public void alta(int id, String nombre, double promedio) {
        if (contador < 25) {
            alumnos[contador] = new Alumno(id, nombre, promedio);
            contador++;
            System.out.println(">>> Alumno guardado.");
        } else {
            System.out.println(">>> Error: No hay espacio.");
        }
    }

    public void buscar(int id) {
        for (int i = 0; i < contador; i++) {
            if (alumnos[i].id == id && alumnos[i].activo) {
                System.out.println("Resultado: " + alumnos[i].nombre + " (Prom: " + alumnos[i].promedio + ")");
                return;
            }
        }
        System.out.println("Alumno no encontrado o está inactivo.");
    }

    public void actualizarPromedio(int id, double nuevoProm) {
        for (int i = 0; i < contador; i++) {
            if (alumnos[i].id == id && alumnos[i].activo) {
                alumnos[i].promedio = nuevoProm;
                System.out.println(">>> Promedio actualizado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró al alumno activo.");
    }

    public void bajaLogica(int id) {
        for (int i = 0; i < contador; i++) {
            if (alumnos[i].id == id) {
                alumnos[i].activo = false;
                System.out.println(">>> El alumno ha sido desactivado.");
                return;
            }
        }
        System.out.println("ID no encontrado.");
    }

    public void listarActivos() {
        System.out.println("\n--- ALUMNOS ACTIVOS ---");
        boolean hayActivos = false;
        for (int i = 0; i < contador; i++) {
            if (alumnos[i].activo) {
                System.out.println("ID: " + alumnos[i].id + " | " + alumnos[i].nombre + " | Prom: " + alumnos[i].promedio);
                hayActivos = true;
            }
        }
        if (!hayActivos) System.out.println("No hay alumnos activos registrados.");
    }

    public void generarReportes() {
        if (contador == 0) {
            System.out.println("No hay datos.");
            return;
        }

        double suma = 0;
        int activos = 0;
        Alumno mayor = null;
        Alumno menor = null;
        int masDeOcho = 0;

        for (int i = 0; i < contador; i++) {
            if (alumnos[i].activo) {
                suma += alumnos[i].promedio;
                activos++;

                if (mayor == null || alumnos[i].promedio > mayor.promedio) mayor = alumnos[i];
                if (menor == null || alumnos[i].promedio < menor.promedio) menor = alumnos[i];
                if (alumnos[i].promedio >= 8.0) masDeOcho++;
            }
        }

        if (activos > 0) {
            System.out.println("\n--- REPORTES DE ACTIVOS ---");
            System.out.println("Promedio General: " + (suma / activos));
            System.out.println("Mayor Promedio: [" + mayor.id + "] " + mayor.nombre + " con " + mayor.promedio);
            System.out.println("Menor Promedio: [" + menor.id + "] " + menor.nombre + " con " + menor.promedio);
            System.out.println("Alumnos con 8.0 o mas: " + masDeOcho);
        } else {
            System.out.println("No hay alumnos activos para los reportes.");
        }
    }

    public Alumno[] getAlumnos() { return alumnos; }
    public int getContador() { return contador; }
}