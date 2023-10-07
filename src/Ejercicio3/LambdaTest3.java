package Ejercicio3;

public class LambdaTest3 {
    public static void main(String[] args) {
        //Diferentes implementaciones del método calcular
        engine((x, y) -> x+y);
        engine((x, y) -> x-y);
        engine((x, y) -> x*y);
        engine((x, y) -> x/y);
        engine((x, y) -> x%y);
    }

    public static void engine(Calculadora calc){
        int x = 4, y = 2;
        int resultado = calc.calcular(x, y);
        System.out.println(resultado);
    }
}
