import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite qualquer número real e descubra a quinta parte desse número: ");
        float num = scanner.nextFloat();

        float numQuintaParte = num / 5;

        System.out.println("A quinta parte do número "+ num + " é "+ numQuintaParte);

        scanner.close();
    }
}