import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score1, score2, mean;
        score1 = scanner.nextDouble();

        System.out.println("Digite a primeira nota: ");
        score1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        score2 = scanner.nextDouble();

        mean = (score1+score2)/2;
        System.out.println("Média = "+ mean);

        System.out.println(mean<50 ? "Reprovado" : "Aprovado");
        // se verdadeiro = "reprovado"; se falso = "aprovado"
    }
}