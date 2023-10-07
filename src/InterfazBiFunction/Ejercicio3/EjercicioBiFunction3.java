package InterfazBiFunction.Ejercicio3;

import java.util.Arrays;
import java.util.List;

public class EjercicioBiFunction3 {
    public static void main(String[] args) {
        List<Empleado> empleadoList = Arrays.asList(
                new Empleado("Doris", 3000),
                new Empleado("Diego", 2000),
                new Empleado("Wilmar", 1300),
                new Empleado("Fernando", 700),
                new Empleado("Elías", 1800),
                new Empleado("Liliana", 2200),
                new Empleado("Stiven", 1950),
                new Empleado("Jorge", 4000),
                new Empleado("Luciano", 3500),
                new Empleado("Andrés", 3050)
        );
        Calculadora cal = new Calculadora();
        List<Double> salarios = cal.calcula((salario, incremento) ->
                salario + (salario *(incremento/100)),empleadoList,16.0);

        for (Double salario : salarios){
            System.out.println(salario);
        }
    }
}
