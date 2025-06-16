import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra/frase: ");
        String texto = scanner.nextLine();

        if (ehPalindromo(texto)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String texto) {
        texto = texto.replace(" ", "").toLowerCase();

        int esquerda = 0;
        int direita = texto.length() - 1;

        while (esquerda < direita) {
            if (texto.charAt(esquerda) != texto.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }
}
