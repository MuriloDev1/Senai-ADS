import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("O número deve ser maior que 0.");
        } else {
            int resultado = somarInteiros(numero);
            System.out.println("A soma de 1 até " + numero + " é: " + resultado);
        }
    }

    public static int somarInteiros(int n) {
        if (n == 1)
            return 1;
        else
            return n + somarInteiros(n-1);
    }
}
