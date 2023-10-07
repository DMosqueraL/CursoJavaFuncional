package InterfazConsumer.Ejercicio2;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes {
    public void aceptarTodos(List<Estudiante> estudiantes, Consumer<Estudiante> consEst){
        for (Estudiante estudiante : estudiantes){
            consEst.accept(estudiante);
        }
    }
}
