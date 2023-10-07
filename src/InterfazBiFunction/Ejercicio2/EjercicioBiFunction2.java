package InterfazBiFunction.Ejercicio2;

import java.util.function.BiFunction;

public class EjercicioBiFunction2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        String resultado = calculadora.calcula((x, y) -> "" + (x*y), 60, 10);

        System.out.println("El resultado es: " + resultado);
    }
}
