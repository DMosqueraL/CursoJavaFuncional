package InterfazBiPredicate.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluador {
    public List<Empleado> evaluar (List<Empleado> listEmp, BiPredicate<Integer, String> eval){
        List<Empleado> listNueva = new ArrayList<>();

        for (Empleado empleado : listEmp){
            if (eval.test(empleado.getEdad(), empleado.getDepartamento())){
                listNueva.add(empleado);
            }
        }
        return listNueva;
    }
}
