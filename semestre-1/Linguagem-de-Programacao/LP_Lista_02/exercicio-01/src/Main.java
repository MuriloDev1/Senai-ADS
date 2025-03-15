import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e descubra seu dobro: ");
        int num = scanner.nextInt();

        int dobroNum = num * 2;

        System.out.println("O dobro do número: "+ num + " é " + dobroNum);
    }
}