import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double velocidadeInicial, aceleracao, tempo;

        System.out.println("Digite a velocidade inicial em m/s: ");
        velocidadeInicial = scanner.nextDouble();

        System.out.println("Digite a aceleracao: ");
        aceleracao = scanner.nextDouble();

        System.out.println("Digite o tempo: ");
        tempo = scanner.nextDouble();

        double velocidadeFinal = calculaVelocidadeFinal(velocidadeInicial, aceleracao, tempo);

        System.out.printf("A velocidade final do corpo é: %.2f", velocidadeFinal);
    }

    public static double calculaVelocidadeFinal (double velocidadeInicial, double aceleracao, double tempo) {
        return velocidadeInicial + aceleracao * tempo;
    }
}