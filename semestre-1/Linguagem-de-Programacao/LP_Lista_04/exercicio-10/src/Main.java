import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos de Fibonacci que deseja ver: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um valor inteiro positivo.");
        } else {
            System.out.print("Sequência de Fibonacci até o termo " + n + ": ");

            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i < n ? ", " : ""));
                int proximo = a + b;
                a = b;
                b = proximo;
            }
            System.out.println();
        }
    }
}
