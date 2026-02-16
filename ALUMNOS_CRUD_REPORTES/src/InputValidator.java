public class InputValidator {

    public static boolean esValido(int id, String nombre, double promedio, Alumno[] lista, int contador) {
        if (id <= 0) return false;

        if (nombre == null || nombre.trim().isEmpty()) return false;

        if (promedio < 0 || promedio > 10) return false;

        for (int i = 0; i < contador; i++) {
            if (lista[i].id == id) {
                return false;
            }
        }

        return true;
    }
}