import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite medida de distancia em milhas: ");
        float milhas = scanner.nextFloat();

        float converteParaKm = milhas * 1.609f;

        System.out.println("A medida em Milhas: "+ milhas + " Para Milhas é "+ converteParaKm );
    }
}