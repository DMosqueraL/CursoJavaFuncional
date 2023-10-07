package InterfazFunction.Ejercicio1;

import java.util.function.Function;

/**
 * La Interfaz Function recibe un parámetro de un tipo y lo devuelve de otro tipo
 */
public class TestFunction {
    public static void main(String[] args) {
        Function<Integer, String> convertidor2 = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        }; //Lo anterior es exactamente lo mismo que la E.L de convertidor

        Function<Integer, String> convertidor = x -> Integer.toString(x);

        System.out.println(convertidor.apply(5).length());
        System.out.println(convertidor.apply(66).length());
    }
}
