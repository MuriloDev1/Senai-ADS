import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("---CAIXA ELETRÔNICO---");
        System.out.println("5 - Consultar saldo");
        System.out.println("6 - Sacar dinheiro");
        System.out.println("7 - Depositar dinheiro");
        System.out.println("8 - Transferência");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opção (5 a 9): ");
        int opcao = scanner.nextInt();

        if (opcao == 5) {
            System.out.println("Você escolheu: Consultar saldo");
        } else if (opcao == 6) {
            System.out.println("Você escolheu: Sacar dinheiro");
        } else if (opcao == 7) {
            System.out.println("Você escolheu: Depositar dinheiro");
        } else if (opcao == 8) {
            System.out.println("Você escolheu: Transferência");
        } else if (opcao == 9) {
            System.out.println("Você escolheu: Sair");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}