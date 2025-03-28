import java.util.Scanner;

public class Main {
    public static double celsiusParaFahrenheit (double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite temperatura em Celsius");
        int celsius = scanner.nextInt();

        double fahrenheit = celsiusParaFahrenheit(celsius);

        System.out.println(celsius+"C°"+ "Em Fahrenheit: "+ fahrenheit);
    }
}