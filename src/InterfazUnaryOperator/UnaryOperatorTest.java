package InterfazUnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * La interfaz UnaryOperator hereda de la interfaz Function, la diferencia o más bien
 * su detalle de implementación es: el tipo de parámetro que se ingresa es el mismo
 * que devuelve.
 */
public class UnaryOperatorTest {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        List<Integer> listAct = operatorUnary(num -> num*num, lista);

        listAct.forEach(System.out::println);
    }

    public static List<Integer> operatorUnary(UnaryOperator<Integer> unaryOp, List<Integer> lista){
        List<Integer> listaActualizada = new ArrayList<>();

        lista.forEach(num -> listaActualizada.add(unaryOp.apply(num)));

        return listaActualizada;
    }
}
