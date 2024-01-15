import java.util.InputMismatchException;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;

            do {
                try {
                    System.out.println("Operaciones disponibles:");
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Multiplicación");
                    System.out.println("4. División");
                    System.out.println("5. Salir");
                    System.out.print("Seleccione una operación (1-5): ");
                    int opcion = scanner.nextInt();

                    if (opcion == 5) {
                        salir = true;
                        System.out.println("Saliendo del programa.");
                    } else {
                        System.out.print("Ingrese el primer número: ");
                        int num1 = scanner.nextInt();

                        System.out.print("Ingrese el segundo número: ");
                        int num2 = scanner.nextInt();

                        int resultado;
                        switch (opcion) {
                            case 1:
                                resultado = Calculadora.sumar(num1, num2);
                                System.out.println("Resultado de la suma: " + resultado);
                                break;
                            case 2:
                                resultado = Calculadora.restar(num1, num2);
                                System.out.println("Resultado de la resta: " + resultado);
                                break;
                            case 3:
                                resultado = Calculadora.multiplicar(num1, num2);
                                System.out.println("Resultado de la multiplicación: " + resultado);
                                break;
                            case 4:
                                resultado = Calculadora.dividir(num1, num2);
                                System.out.println("Resultado de la división: " + resultado);
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, seleccione una operación del 1 al 5.");
                                break;
                        }
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error de entrada: Ingrese un número entero válido");
                    scanner.next(); // Limpiar el buffer de entrada

                } catch (ArithmeticException e) {
                    System.out.println("Error aritmético: " + e.getMessage());

                } catch (Exception e) {
                    System.out.println("Error general: " + e.getMessage());

                }
            } while (!salir);

            scanner.close();
        }
}
