import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite uma medida em polegadas: ");
        double polegada = scanner.nextDouble();

        double converteMilimetros =  polegada * 25.4;

        System.out.println("A medida em polegadas: "+ polegada + " para Milimetros é "+ converteMilimetros);


    }
}