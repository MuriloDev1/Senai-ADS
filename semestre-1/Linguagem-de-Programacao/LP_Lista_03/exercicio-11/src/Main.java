import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Descubra o dia da semana!");
        System.out.print("Digite um número de 1 a 7: ");
        num = scanner.nextInt();

        if (num == 1)
            System.out.println("Domingo");
        else if (num == 2)
            System.out.println("Segunda-feira");
        else if (num == 3)
            System.out.println("Terça-feira");
        else if (num == 4)
            System.out.println("Quarta-feira");
        else if (num == 5)
            System.out.println("Quinta-feira");
        else if (num == 6)
            System.out.println("Sexta-feira");
        else if (num == 7)
            System.out.println("Sábado");
        else
            System.out.println("Número inválido! Digite um número entre 1 e 7.");
    }
}