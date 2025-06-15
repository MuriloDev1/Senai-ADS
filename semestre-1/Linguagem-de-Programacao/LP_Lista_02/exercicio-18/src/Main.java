import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b;

        System.out.println("Digite o valor do coeficiente - A");
        a = scanner.nextFloat();

        System.out.println("Digite o valor do coeficiente - B");
        b = scanner.nextFloat();

        formulaEquacao(a,b);
    }

    public static void formulaEquacao (float a, float b) {
        if (a == 0 && b == 0)
            System.out.println("Infinitas soluções");
        else if (a == 0) {
            System.out.println("Não tem solução");
        } else {
            float x = -b/a;
            System.out.printf("O valor da equação é: %.2f%n", x);
        }
    }
}