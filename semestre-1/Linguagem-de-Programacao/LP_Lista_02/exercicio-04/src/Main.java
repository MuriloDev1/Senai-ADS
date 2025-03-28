import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Criando uma lógica de media de notas que seja dinâmica

        // Criando array
        // New cria um objeto
        int[] numeros = new int[3];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite suas notas para saber a média: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        double media = (double) soma / numeros.length;
        System.out.println("A média das notas é: "+ media);

        scanner.close();

    }
}