public class Main {
    public static void main(String[] args) {

        Gato botas = new Gato("Botas");
        Perro bruno = new Perro("Perro");

        // --- SECCIÓN DE HERENCIA ---
        // Aquí se usan métodos que Gato y Perro no escribieron,
        // sino que "heredaron" de la clase Animal.

        botas.comer();
        botas.hacerSonido();
        System.out.println("-------------------");
        bruno.comer();
        bruno.hacerSonido();

        // --- SECCIÓN DE POLIMORFISMO ---
        // Aquí se creo un arreglo de tipo "Animal" pero guardas objetos distintos.
        // El programa decide en tiempo de ejecución, qué sonido hacer según el animal.

        Animal[] animales = new Animal[3];
        animales[0] = new Perro("Rufus");
        animales[1] = new Gato("Honey");
        animales[2] = new Perro("Solovino");

        for (Animal animal : animales) {
            System.out.println("-------");
            animal.comer();
            animal.hacerSonido();
        }

        // --- SECCIÓN DE CAST ---
        // Conviertes temporalmente una referencia de "Animal" a "Perro"
        // para poder usar un metodo que solo los perros tienen (marcarTerritorio).

        Animal animal1 = new Perro("nicky");
        Perro perr1 = (Perro) animal1;
        perr1.marcarTerritorio();
    }
}