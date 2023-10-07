package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(24L, 6L));
    }

    private static CalculadoraLong create(){
        return (x, y) -> x / y;
    }
}
