import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números separados por espaço:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        if (n1 > maior) maior = n1;
        if (n1 < menor) menor = n1;

        if (n2 > maior) maior = n2;
        if (n2 < menor) menor = n2;

        if (n3 > maior) maior = n3;
        if (n3 < menor) menor = n3;

        if (n4 > maior) maior = n4;
        if (n4 < menor) menor = n4;

        if (n5 > maior) maior = n5;
        if (n5 < menor) menor = n5;

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}
