import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i = 1;

        System.out.println("Descubra a tabuada");
        System.out.println("Digite um valor: ");
        num = scanner.nextInt();

        while (i<=10) {
            System.out.println(num + " X "+ i + " = " +(num * i));
            i++;
        }
    }
}