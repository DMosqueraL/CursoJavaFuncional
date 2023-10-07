package InterfazPredicate.Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Doris", 43, 3500, "Sistemas"),
                new Empleado("Ana", 34, 2000, "Ventas"),
                new Empleado("Andrés", 27, 1700, "Mostrador"),
                new Empleado("Sofía", 33, 2500, "Cobranzas"),
                new Empleado("Wilmar", 41, 4500, "Sistemas"),
                new Empleado("Eliana", 28, 900, "Mostrador"),
                new Empleado("Peter", 30, 850, "Cobranzas"),
                new Empleado("Laura", 31, 600, "Compras"),
                new Empleado("Sebastián", 35, 2600, "Ventas"),
                new Empleado("Matías", 50, 4000, "Sistemas"),
                new Empleado("Camila", 23, 3500, "Sistemas"),
                new Empleado("Ana Lucía", 24, 2000, "Ventas"),
                new Empleado("Felipe", 27, 1500, "Mostrador"),
                new Empleado("Sonia", 25, 2200, "Cobranzas"),
                new Empleado("Camilo", 31, 4500, "Sistemas"),
                new Empleado("Elena", 28, 1100, "Mostrador"),
                new Empleado("Patricia", 21, 1050, "Mostrador"),
                new Empleado("Leonardo", 31, 600, "Compras"),
                new Empleado("Sandra", 20, 3000, "Ventas"),
                new Empleado("Javier", 26, 3100, "Ventas")
        );

        EvaluadorEmpl evaluador = new EvaluadorEmpl();

        System.out.println("Empleados con salarios mayores a US$2500: ");
        List<Empleado> emplSalariosAltos =
                evaluador.evaluar(listaEmpleados, empleado -> empleado.getSalario() > 2500);

        for (Empleado empleado : emplSalariosAltos){
            System.out.println(empleado.getNombre());
        }

        System.out.println("\nEmpleados cuyo nombre inicia con la letra J: ");
        List<Empleado> nombreEmplIniciaConJ =
                evaluador.evaluar(listaEmpleados, empleado -> empleado.getNombre().startsWith("J"));

        for (Empleado empleado : nombreEmplIniciaConJ){
            System.out.println(empleado.getNombre());
        }

        System.out.println("\nEmpleados cuya edad es menor a 25 años: ");
        List<Empleado> emplJovenes =
                evaluador.evaluar(listaEmpleados, empleado -> empleado.getEdad() < 25);

        for (Empleado empleado : emplJovenes){
            System.out.println(empleado.getNombre());
        }

        /**
         * Combinación interfaz BiFunction + Predicate
         */
        Funciones func = new Funciones();
        for (Empleado empleado : emplJovenes){
            Double nuevoSalario = func.incrementoSalario(empleado, 10.0,
                    (salario, incremento) -> salario + (salario * (incremento/100)));
            empleado.setSalario(nuevoSalario);
        }
        System.out.println("Programa de Incremento Salarial para Empleados Jóvenes: ");
        for (Empleado empleado : emplJovenes){
            System.out.println("Nombre: " + empleado.getNombre() +
                    " Salario: " + empleado.getSalario());
        }

        /**
         * Implementando el Método negate() de la interfaz Predicate
         */
        System.out.println("\nEmpleados cuya edad es mayor a 25 años: ");
        List<Empleado> emplMayores =
                evaluador.evaluarContrario(listaEmpleados, empleado -> empleado.getEdad() < 25);

        for (Empleado empleado : emplMayores){
            System.out.println(empleado.getNombre());
        }
    }
}
