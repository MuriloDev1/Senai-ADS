import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua velocidade em Km/h: ");
        double velocidadeKm = scanner.nextDouble();

        double converteKm = velocidadeKm / 3.6;

        System.out.println("Velocidade em Km/h: "+ velocidadeKm);
        System.out.println("Velocidade em M/s: "+ converteKm);
    }
}