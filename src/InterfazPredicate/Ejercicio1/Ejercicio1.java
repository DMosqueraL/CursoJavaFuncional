package InterfazPredicate.Ejercicio1;

import java.util.function.Predicate;

/**
 * La interfaz Predicate recibe un parámetro y devuelve un valor boleano
 * Su método abstracto es el método test
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (valor) -> valor > 0;

        System.out.println(predicate.test(123));
    }
}
