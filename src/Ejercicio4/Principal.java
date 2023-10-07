package Ejercicio4;

public class Principal {
    public static void main(String[] args) {
        //Ambigüedad en la inferencia de las expresiones Lambda
        //1. Indicar el tipo de variable al invocar el método engine
        engine((Long x, Long y) -> x+y);
        engine((int x, int y) -> x+y);

        //2. Hacer un casting dentro de la invocación del método engine
        engine((CalculadoraInt) (x, y) -> x*y); //E.L como casting en una invocación
        engine((CalculadoraLong) (x, y) -> x*y);

        //3. Instanciar un objeto que implemente el método
        CalculadoraInt calInt = (x, y) -> x + y; // E.L como asignación a una referencia (interfaz)
        CalculadoraLong calLong = (x, y) -> x + y;

        engine(calInt); //E.L como argumento de un método
        engine(calLong);
    }

    public static void engine(CalculadoraInt calc){}

    public static void engine(CalculadoraLong calc){}
}
