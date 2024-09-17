package src;
public class Promocion {
    // Una única instancia de la clase Promocion(un solo objeto)
    private static Promocion instancia;

    // Variable booleana para verificar si ya se ha dado el código 
    private boolean codigoEntregado = false;

    // Constructor privado para no crear más de un objeto 
    private Promocion() {
        //simulacion de codigo concedido
        System.out.println("El código de promoción de PS4 te ha sido concedido.");
    }

    // Método estático para comprobar si la promoción se ha dado
    public static Promocion comprobar() {
        if (instancia == null) {
            // Si no existe el objeto, lo crea
            instancia = new Promocion();
        } else {
            System.out.println("Ya te lo hemos concedido que mas quieres? :( no es suficiente acaso??");
        }
        //devuleve la instancia creada o que ya estaba creada 
        return instancia;
    }

    // Método para entregar el código
    public void darcodigo(String codigo) {
        //si codigo entregado es verdadero
        if (!codigoEntregado) {
            System.out.println("Enhorabuena, tu código es: " + codigo);
            //asi si vuelve a s er llamado ira al else 
            codigoEntregado = true; // Marcamos que el código ya se ha entregado
        } else {
            System.out.println("No te podemos mas mas codigos se siente ");
        }
    }
}
