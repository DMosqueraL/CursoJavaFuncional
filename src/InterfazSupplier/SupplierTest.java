package InterfazSupplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "Doris";

        System.out.println("El valor pasado es: " + sup.get());
    }
}
