import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetor = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(vetor);
        int numero;

        System.out.println("Digite um valor inteiro: ");
        numero = scanner.nextInt();

        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}