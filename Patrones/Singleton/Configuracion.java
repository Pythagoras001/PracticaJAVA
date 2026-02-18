public class Configuracion {

    private static Configuracion instancia;

    // Constructor privado
    private Configuracion() {
        System.out.println("Instancia creada");
    }

    // Método público para obtener la única instancia
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }
}
