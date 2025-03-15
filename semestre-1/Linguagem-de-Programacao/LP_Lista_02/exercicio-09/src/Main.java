import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite medida de distancia em quilometros: ");
        float km = scanner.nextFloat();

        float converteParaMilhas = km / 1.609f;

        System.out.println("A medida em quilometros: "+ km + " Para Milhas é "+ converteParaMilhas );
    }
}