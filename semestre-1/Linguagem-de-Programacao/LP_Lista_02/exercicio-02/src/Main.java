import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e descubra seu quadrado");
        int num = scanner.nextInt();

        int numQuadrado = num * num;

        System.out.println("O quadrado do número: "+ num + " é "+ numQuadrado);


    }
}