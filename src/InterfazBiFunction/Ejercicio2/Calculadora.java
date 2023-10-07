package InterfazBiFunction.Ejercicio2;

import java.util.function.BiFunction;

public class Calculadora {
    public String calcula (BiFunction<Integer, Integer, String> bi, Integer int1, Integer int2){
        return bi.apply(int1, int2);
    }
}
