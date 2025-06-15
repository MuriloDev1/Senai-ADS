import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        double peso1 = 1;
        double peso2 = 2;

        System.out.println("Média de notas com Pesos Diferentes");
        System.out.println("-----");

        System.out.println("Digite sua primeira nota e segunda nota (separadas por espaço): ");
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();

        double somaNotas = (n1 * peso1) + (n2 * peso2);
        double somePeso = peso1 + peso2;

        double media = somaNotas / somePeso;

        if (media > 10 ) {
            System.out.println("O resultado da média das notas "+ n1 + " E "+ n2 + " É: "+ "10" );
        } else {
            System.out.println("O resultado da média das notas "+ n1 + " E "+ n2 + " É: "+ media);
        }
    }
}