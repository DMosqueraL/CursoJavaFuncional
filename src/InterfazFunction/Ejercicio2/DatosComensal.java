package InterfazFunction.Ejercicio2;

import java.util.function.Function;

public class DatosComensal {
    public static void main(String[] args) {
        Comensal com1 = new Comensal("Doris", 15000, 5);

        String nombreCom = (String) getDatoComensal(com1, x -> x.getNombre()); // Usando referencia al método -> Comensal::getNombre
        int mesa = (int) getDatoComensal(com1, x -> x.getMesa());

        System.out.println("El nombre del comensal es: " + nombreCom);
        System.out.println("La mesa del comensal es: " + mesa);
    }

    public static Object getDatoComensal(Comensal comensal, Function<Comensal, Object> funcion) {
        return funcion.apply(comensal);
    }
}
