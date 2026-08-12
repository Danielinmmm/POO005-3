import java.util.Scanner;

public class Main {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        System.out.println("El factorial de " + n + " es: " + factorial(n));
    }
}
