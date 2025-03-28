import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua velocidade em M/s: ");
        double velocidadeMs = scanner.nextDouble();

        double converteMs = velocidadeMs * 3.6;

        System.out.println("Velocidade em M/s: "+ velocidadeMs);
        System.out.println("Velocidade em Km: "+ converteMs);

    }
}