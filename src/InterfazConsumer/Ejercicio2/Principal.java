package InterfazConsumer.Ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {
    public static void main(String[] args) {
        List<Estudiante> lisEstudiantes = Arrays.asList(
                new Estudiante("Daniela", 2.0),
                new Estudiante("Sergio", 3.5),
                new Estudiante("Doris", 5.0),
                new Estudiante("Wilmar", 3.8),
                new Estudiante("Matías", 4.1),
                new Estudiante("Manuel", 3.0),
                new Estudiante("Sandra", 2.9),
                new Estudiante("Alex", 4.8),
                new Estudiante("Beatriz", 4.0),
                new Estudiante("Laura", 2.6),
                new Estudiante("Rodrigo", 3.7),
                new Estudiante("Javier", 5.0),
                new Estudiante("Rafael", 4.4),
                new Estudiante("Antonia", 3.4),
                new Estudiante("Rosa", 3.9)
        );

        OperacionEstudiantes op = new OperacionEstudiantes();

        Consumer<Estudiante> cons1 = est ->
                System.out.println("Nombre: " + est.getNombre() +
                        " Calificación: " + est.getCalificacion());
        System.out.println("\nListado de Estudiantes y su Definitiva.");
        op.aceptarTodos(lisEstudiantes, cons1);

        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.10);
        op.aceptarTodos(lisEstudiantes, cons2);

        System.out.println("\nListado Estudiantes con Definitiva Actualizada");
        op.aceptarTodos(lisEstudiantes, cons1);

        /**
         * Implementando el método default andThen de la interfaz Consumer
         */
        System.out.println("\nOtro Listado Estudiantes con Definitiva Actualizada");
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);
        op.aceptarTodos(lisEstudiantes, cons3);
    }
}
