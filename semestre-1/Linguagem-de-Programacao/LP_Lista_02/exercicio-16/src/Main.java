import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, altura;

        System.out.println("Digite o raio do cone: ");
        raio = scanner.nextDouble();

        System.out.println("Digite a altura do cone: ");
        altura = scanner.nextDouble();

        double volume = calculaVolumeCone(raio, altura);

        System.out.printf("o volume do cone de raio %.2f e altura %.2f é: %.2f%n",raio,altura,volume);
    }

    public static double calculaVolumeCone (double raio, double altura) {
        return (1.0/3) * Math.PI * raio * raio * altura ;
    }
}