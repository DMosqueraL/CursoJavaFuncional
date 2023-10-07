package InterfazBiConsumer.Ejercicio2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        String[][] arreglo = {{"Chris", "USA"}, {"Rajul", "India"}, {"Linda", "Canada"}, {"Doris", "Colombia"}};

        //Crear un map usando el array
        for (int i = 0; i < arreglo.length; i++){
            map.put(arreglo[i][0], arreglo[i][1]);
        }

        System.out.println("Manera tradicional de imprimir un map clave y valor");

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        if (iter != null){
            while (iter.hasNext()){
                Map.Entry<String, String> entry = iter.next();
                System.out.println("Clave: " + entry.getKey() +
                        "\t Valor: " + entry.getValue());
            }
        }

        System.out.println("\nUsando BiConsumer y Expresiones Lambda");
        map.forEach((key, value) -> {
            System.out.println("Clave: " + key + "\t" + " Valor: " + value); // Usando E.L
        });
    }
}
