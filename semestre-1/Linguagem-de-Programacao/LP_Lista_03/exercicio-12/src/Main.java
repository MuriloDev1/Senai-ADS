import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2;
        int opcao;

        System.out.println("Digite o primeiro numero: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = scanner.nextInt();

        System.out.println("------------------");
        System.out.printf("Menu: %n" +
                          "1. Soma %n" +
                          "2. Subtração %n" +
                          "3. Multiplicação %n" +
                          "4. Divisão");
        System.out.println("------------------");

        System.out.println("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("Resultado: "+ (n1 + n2));
                break;
            }
            case 2: {
                System.out.println("Resultado: "+ (n1 - n2));
                break;
            }
            case 3: {
                System.out.println("Resultado: "+ (n1 * n2));
                break;
            }
            case 4: {
                System.out.println("Resultado: "+ (n1 / n2));
                break;
            }
            default:
                System.out.println("Número Inválido");
        }
    }
}