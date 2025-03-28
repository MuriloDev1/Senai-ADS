import java.util.Scanner;

public class Main {
    public static int notaPesos (int n1, int n2) {
        return (n1 + (n2 * 2)) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite sua segunda nota: ");
        int n2 = scanner.nextInt();

        double media = notaPesos(n1, n2);

        System.out.println("A média das notas (Nota 1 - peso 1 e Nota 2 - peso 2 é: "+ media);
    }
}