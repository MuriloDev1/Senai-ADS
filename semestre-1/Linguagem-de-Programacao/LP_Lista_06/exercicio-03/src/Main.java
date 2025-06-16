import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        if (expoente < 0) {
            System.out.println("O expoente deve ser maior ou igual a zero.");
        } else {
            long resultado = potencia(base, expoente);
            System.out.println(base + " elevado" + expoente + " é: " + resultado);
        }
    }

    public static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }
}
