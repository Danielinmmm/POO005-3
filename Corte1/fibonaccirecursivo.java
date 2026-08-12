import java.util.Scanner;

public class Main {

    // Método recursivo para calcular Fibonacci
    public static int fibonacci(int n) {
        
        // Casos base
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Llamada recursiva
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la posición de Fibonacci: ");
        int n = sc.nextInt();

        // Validar que no sea negativo
        if (n < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        }

        sc.close();
    }
}
