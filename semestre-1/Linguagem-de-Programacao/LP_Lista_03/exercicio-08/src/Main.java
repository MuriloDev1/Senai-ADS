import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Insira um número inteiro: ");
        num = scanner.nextInt();
        boolean isOdd = num % 2 == 0;

            System.out.println(isOdd ? "Par" : "ímpar");
    }
}