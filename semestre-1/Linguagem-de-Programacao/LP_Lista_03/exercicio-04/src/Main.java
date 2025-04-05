import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score1, score2, mean, recovery;

        System.out.println("Digite a primeira nota: ");
        score1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        score2 = scanner.nextDouble();

        mean = (score1 + score2) / 2;
        System.out.println("Média = " + mean);

        if (mean >= 50) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Digite a nota da recuperação: ");
            recovery = scanner.nextDouble();

            mean = (mean + recovery)/2;

            // média recalculada
            if (mean<50)
                System.out.println("Reprovado");
            else
                System.out.println("Aprovado");
        }
    }
}