package InterfazBiPredicate.Ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/**
 * Se requiere obtener un reporte con todos los empleados que cumplan
 * con alguno de estos dos conjuntos de criterios:
 * 1. 25 años en adelante y que estén en el departamento de Ventas, o
 * 2. 25 años en adelante y que estén en el Mostrador
 */

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
                new Empleado("Sebastián", 35, 2000, "Ventas"),
                new Empleado("Matías", 50, 3000, "Sistemas"),
                new Empleado("Camila", 23, 3500, "Sistemas"),
                new Empleado("Ana Lucía", 24, 2000, "Ventas"),
                new Empleado("Felipe", 27, 1500, "Mostrador"),
                new Empleado("Sonia", 25, 2200, "Cobranzas"),
                new Empleado("Camilo", 31, 4500, "Sistemas"),
                new Empleado("Elena", 28, 1100, "Mostrador"),
                new Empleado("Peter", 30, 1050, "Mostrador"),
                new Empleado("Laura", 31, 600, "Compras"),
                new Empleado("Santiago", 25, 2000, "Ventas"),
                new Empleado("Javier", 26, 2000, "Ventas")
        );

        Evaluador evaluador = new Evaluador();

        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad > 25)
                && (departamento.equals("Ventas"));

        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad > 25)
                && (departamento.equals("Mostrador"));

        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);

        System.out.println("Empleados del Mostrador o Ventas, mayores de 25 años");

        List<Empleado> listActualizada = evaluador.evaluar(listaEmpleados, criterio);

        for (Empleado empleado: listActualizada){
            System.out.println("Nombre: " + empleado.getNombre() +
                            " Edad: " + empleado.getEdad() +
                            " Departamento: " + empleado.getDepartamento());
        }
    }
}
