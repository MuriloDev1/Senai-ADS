import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra;
        int opcaoPagamento;

        System.out.println("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        System.out.println("----------------------------");
        System.out.println("Formas de pagamento:");
        System.out.println("1. Débito (5% de desconto)");
        System.out.println("2. Pix (10% de desconto)");
        System.out.println("3. Crédito (taxas)");
        System.out.println("----------------------------");
        System.out.print("Escolha a opção: ");
        opcaoPagamento = scanner.nextInt();

        System.out.println("----------------------------");

        switch (opcaoPagamento) {
            case 1:
                double descontoDebito = valorCompra * 0.05;
                double totalDebito = valorCompra - descontoDebito;
                System.out.printf("Total a pagar no Débito: R$ %.2f%n", totalDebito);
                break;

            case 2:
                double descontoPix = valorCompra * 0.10;
                double totalPix = valorCompra - descontoPix;
                System.out.printf("Total a pagar no Pix: R$ %.2f%n", totalPix);
                break;

            case 3:
                System.out.print("Informe a quantidade de parcelas (até 10x): ");
                int parcelas = scanner.nextInt();

                if (parcelas < 1 || parcelas > 10) {
                    System.out.println("Quantidade de parcelas inválida. Deve ser entre 1 e 10.");
                } else {
                    double taxa;
                    if (parcelas <= 4) {
                        taxa = valorCompra * 0.02;
                    } else {
                        taxa = valorCompra * 0.05;
                    }

                    double totalCredito = valorCompra + taxa;
                    double valorParcela = totalCredito / parcelas;

                    System.out.printf("Total a pagar no Crédito: R$ %.2f%n", totalCredito);
                    System.out.printf("Em %d parcelas de: R$ %.2f%n", parcelas, valorParcela);
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
