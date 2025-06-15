import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, x2;

        System.out.println("Digite a primeira raiz:");
        x1 = scanner.nextDouble();

        System.out.println("Digite a segunda raiz:");
        x2 = scanner.nextDouble();

        double a = 1; // Você pode usar outro valor, mas geralmente é 1
        double b = -(x1 + x2);
        double c = x1 * x2;

        System.out.printf("A equação do segundo grau é: %.0fx² + %.2fx + %.2f = 0%n", a, b, c);
    }
}
