import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite dois números inteiros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 < 1 || n2 < 1) {
            System.out.println("Número inválido");
        }
        else if (n1 == n2) {
            System.out.println("Números iguais");
        }
        else {
            int menor = Math.min(n1, n2);
            int maior = Math.max(n1, n2);

            System.out.println("Números existentes entre " + n1 + " e " + n2 + ":");
            for (int i = menor + 1; i < maior; i++) {
                System.out.println(i);
            }
        }
    }
}
