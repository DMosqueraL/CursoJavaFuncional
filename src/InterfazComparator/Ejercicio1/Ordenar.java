package InterfazComparator.Ejercicio1;

import InterfazComparator.Ejercicio2.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenar {
    //Orden natural de Strings con Comparable
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Doris", "Carlos", "Zaray", "Ana Rosa", "Wilmar");

        System.out.println("\nLista Original (Sin ordenar): " + nombres);

        Collections.sort(nombres);
        System.out.println("\nLista después de ordenarse: " + nombres);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Doris"));
        personas.add(new Persona(2, "Wilmar"));
        personas.add(new Persona(3, "Ana Rosa"));
        personas.add(new Persona(4, "Sebastián"));
        personas.add(new Persona(5, "Alexandra"));
        System.out.println("\nLista de Personas (sin ordenar): " + personas);

        Collections.sort(personas);
        System.out.println("\nLista de Personas ordenadas por nombre: " + personas);

        List<Persona> personas2 = new ArrayList<>();
        personas2.add(new Persona(2, "Doris"));
        personas2.add(new Persona(5, "Wilmar"));
        personas2.add(new Persona(3, "Ana Rosa"));
        personas2.add(new Persona(4, "Sebastián"));
        personas2.add(new Persona(1, "Alexandra"));

        Collections.sort(personas2, new OrdenarPersonaPorId());
        System.out.println("\nLista de Personas ordenadas por Id: " + personas2);

        Collections.sort(personas2, (p1, p2) -> p1.getIdPersona() - p2.getIdPersona());
        System.out.println("\nLista de Personas ordenadas por Id: " + personas2);
    }
}
