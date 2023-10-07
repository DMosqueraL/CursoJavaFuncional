package InterfazConsumer.Ejercicio1;

import java.util.function.Consumer;

/**
 * La interfaz Consumer recibe un parámetro de cualquier tipo, opera con él en su
 * método abstracto accept y no devuelve nada
 * "Hacer algo con el parámetro de entrada sin necesidad de devolver algún valor"
 */

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> cons = x -> System.out.println("Hola "+ x.toUpperCase());

        cons.accept("Doris");
    }
}
