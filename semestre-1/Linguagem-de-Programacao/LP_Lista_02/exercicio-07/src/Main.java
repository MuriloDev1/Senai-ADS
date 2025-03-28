import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite uma medida em milimetros: ");
        double milimetros = scanner.nextDouble();

        double convertePolegada =  milimetros / 25.4f;

        System.out.println("A medida em milimetros: "+ milimetros + " para Polegadas é "+ convertePolegada);


    }
}