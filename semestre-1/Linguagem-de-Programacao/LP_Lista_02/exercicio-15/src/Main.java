import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, altura;

        System.out.println("Digite o raio do cilindro: ");
        raio = scanner.nextDouble();

        System.out.println("Digite a altura do cilindro: ");
        altura = scanner.nextDouble();

        double volume = calculaVolume(raio, altura);

        System.out.printf("o volume do cilindro de raio %.2f e altura %.2f é: %.2f%n",raio,altura,volume);
    }

    public static double calculaVolume (double raio, double altura) {
        return Math.PI * raio * raio * altura;
    }
}