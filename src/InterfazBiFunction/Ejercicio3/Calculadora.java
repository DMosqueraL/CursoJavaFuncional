package InterfazBiFunction.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora {
    public List<Double> calcula(BiFunction<Double, Double, Double> bi,
                                List<Empleado> listEmpl, Double incremento) {
        List<Double> listSalarios = new ArrayList<>();

        for (Empleado empleado : listEmpl) {
            listSalarios.add(bi.apply(empleado.getSalario(), incremento));
        }
        return listSalarios;
    }
}
