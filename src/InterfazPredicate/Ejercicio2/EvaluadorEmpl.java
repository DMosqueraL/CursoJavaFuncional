package InterfazPredicate.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvaluadorEmpl {
    public List<Empleado> evaluar(List<Empleado> listEmpleados, Predicate<Empleado> eval){
        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado : listEmpleados){
            if(eval.test(empleado)){
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }

    public List<Empleado> evaluarContrario(List<Empleado> listEmpleados, Predicate<Empleado> eval){
        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado : listEmpleados){
            if(eval.negate().test(empleado)){
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }
}
