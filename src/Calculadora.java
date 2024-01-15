import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Error: División por cero");
        }
        return numerador / denominador;
    }
}
