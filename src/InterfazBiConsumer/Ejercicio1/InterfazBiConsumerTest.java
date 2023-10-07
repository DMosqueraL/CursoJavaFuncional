package InterfazBiConsumer.Ejercicio1;

import java.util.function.BiConsumer;

public class InterfazBiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<Double, Double> biConsumer = (num1, num2) -> {
            Double mult = num1*num2;
            System.out.println("La multiplicación es: " + mult);
        };
        biConsumer.accept(15.2, 25.3);
    }
}
