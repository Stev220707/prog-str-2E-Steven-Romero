public class PersonaService {

    private Persona[] personas = new Persona[20];
    private int contador = 0;

    public void alta(int id, String nombre){
        if(contador < 20){
            personas[contador] = new Persona(id, nombre);
            contador++;
            System.out.println("Registrado con exito.");
        }else{
            System.out.println("Error: Arreglo lleno.");
        }
    }

    public void buscar(int id){
        for (int i = 0; i < contador; i++){
            if(personas[i].id == id && personas[i].activa){
                System.out.println("Encontrado: " + personas[i].nombre);
                return;
            }
        }
        System.out.println("Persona no encontrada o inactiva.");
    }

    public void bajaLogica(int id){
        for(int i = 0; i < contador; i++){
            if(personas[i].id == id){
                personas[i].activa = false;
                System.out.println("Baja realizada.");
                return;
            }
        }
        System.out.println("ID no encontrado.");
    }

    public void listar(){
        System.out.println("\n--- LISTA DE ACTIVAS ---");
        for(int i = 0; i < contador; i++){
            if(personas[i].activa){
                System.out.println("ID: " + personas[i].id + " | Nombre: " + personas[i].nombre);
            }
        }
    }

    public void actualizar(int id, String nuevoNombre){
        for (int i = 0; i < contador; i++){
            if (personas[i].id == id && personas[i].activa) {
                personas[i].nombre = nuevoNombre;
                System.out.println("Actualizado correctamente.");
                return;
            }
        }
        System.out.println("No se pudo actualizar (ID inexistente o inactivo.)");
    }

    public Persona[] getPersonas(){
        return personas;
    }
    public int getContador(){
        return contador;
    }


}
