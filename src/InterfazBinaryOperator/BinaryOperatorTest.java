package InterfazBinaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> binOp = (num1, num2) -> num1 * num2;

        //Aplicando el método abstracto Apply
        Integer resultado = binOp.apply(15, 40);
        System.out.println("El resultado es: " + resultado);

        //Aplicando el método minBy
        BinaryOperator<Integer> binOpMinBy = BinaryOperator.minBy((Integer int1, Integer int2) ->
                int1.compareTo(int2)); // referenciando al método: Integer::compareTo

        resultado = binOpMinBy.apply(10, 20);
        System.out.println("El número menor entre 10 y 20 es: " + resultado);

        //Aplicando el método maxBy
        BinaryOperator<Integer> binOpMaxBy = BinaryOperator.maxBy((Integer int1, Integer int2) ->
                int1.compareTo(int2)); // referenciando al método: Integer::compareTo

        resultado = binOpMaxBy.apply(10, 20);
        System.out.println("El número mayor entre 10 y 20 es: " + resultado);
    }
}
