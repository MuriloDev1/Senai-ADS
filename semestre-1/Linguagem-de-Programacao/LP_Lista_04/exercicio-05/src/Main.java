import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro: ");
        num = scanner.nextInt();

        int fatorial = calculaFatorial(num);

        System.out.println("O fatorial de "+ num + "é: "+ fatorial);
    }
    public static int calculaFatorial (int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
          resultado *= i;
        }
        return resultado;
    }
}