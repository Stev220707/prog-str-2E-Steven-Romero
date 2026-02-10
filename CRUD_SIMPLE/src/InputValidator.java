public class InputValidator {

    public static boolean esIdValido(int id){
        return id > 0;
    }

    public static boolean esNombreValido(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    public static boolean idRepetido(int id, Persona[] personas, int contador){
        for (int i = 0; i < contador; i++){
            if(personas[i].id == id){
                return true;
            }
        }
        return false;
    }
}
