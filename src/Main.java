package src;

public class Main {
    public static void main(String[] args) {
        // Intentamos obtener 2 veces el código promocional
        System.out.println("Primer intento de obtener un código promocional:");
        Promocion codigo1 = Promocion.comprobar(); // Se crea la instancia y se concede el código.

        System.out.println("\nSegundo intento de obtener un código promocional:");
        Promocion codigo2 = Promocion.comprobar(); // No se crea otra instancia, se devuelve el mensaje de "te jodes".

        // Intentamos dar el código
        System.out.println("\nIntento de mostrar los códigos:");
        codigo1.darcodigo("skibidi toilet 777");  // Este es el código concedido en el primer intento.
        codigo2.darcodigo("saquenme de aqui 689");  // Ya no se debería entregar un nuevo código, y se muestra el mensaje adecuado.
    }
}

