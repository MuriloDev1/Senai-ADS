import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,n3;

        System.out.println("Digite três números (separados por espaço): ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        calculaCrescente(n1, n2, n3);
    }

    public static void calculaCrescente(int n1, int n2, int n3) {
        int[] numeros = {n1, n2, n3};
        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: " +
                numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}