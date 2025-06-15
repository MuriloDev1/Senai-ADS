import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura;

        System.out.println("Digite a base do triangulo: ");
        base = scanner.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        altura = scanner.nextDouble();

    System.out.println("A área do triângulo de base: "+ base + " E de Altura: "+altura +" É: "+ calculaArea(base,altura));
    }

    public static double calculaArea(double base, double altura) {
        return base * altura / 2;
    }
}