import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, media;

        System.out.println("Digite sua primeira nota: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        n2 = scanner.nextDouble();

        media = (n1+n2)/2;

        if (media >= 8.5)
            System.out.println("Nota: A");
        else if (media >= 7)
            System.out.println("Nota: B");
        else if (media >= 5 & media < 7)
            System.out.println("Nota: C");
        else
            System.out.println("Nota: D");
    }
}