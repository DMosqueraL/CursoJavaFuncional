package InterfazFunction.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {
    public static void main(String[] args) {
        List<Comensal> ListaComensales = Arrays.asList(
                new Comensal("Felipe", 25000, 7),
                new Comensal("Doris", 15000, 5),
                new Comensal("Jesús", 10000, 2),
                new Comensal("Wilmar", 5000, 1),
                new Comensal("Ana", 38000, 3),
                new Comensal("Peter", 150000, 6),
                new Comensal("Matías", 9500, 4)
        );

        List<Object> nombresComensales = getDatosComensales(ListaComensales, x -> x.getNombre());

        System.out.println("La lista de nombres de los comensales es la siguiente: ");
        for (Object nombreComensal: nombresComensales){
            System.out.println("Nombre: " + nombreComensal);
        }
    }

    public static List<Object> getDatosComensales(List<Comensal> listaCom,
                                       Function<Comensal, Object> funcion){
        //Esta lista guardará datos personalizados de los comensales
        List<Object> listaDatos = new ArrayList<>();

        //Iterar a través de la lista de comensales que recibimos
        for (Comensal comensal : listaCom){
            listaDatos.add(funcion.apply(comensal));
        }
        return listaDatos;
    }
}
