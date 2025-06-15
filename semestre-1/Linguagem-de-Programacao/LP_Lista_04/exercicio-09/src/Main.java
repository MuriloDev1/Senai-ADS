import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jogarNovamente;

        do {
            boolean erro = false;

            // percorre as tabuadas de 1 a 10
            for (int base = 1; base <= 10 && !erro; base++) {
                for (int mult = 1; mult <= 10 && !erro; mult++) {
                    int resultadoEsperado = base * mult;
                    System.out.print("Quanto é " + base + " x " + mult + "? ");
                    int resposta = scanner.nextInt();

                    if (resposta != resultadoEsperado) {
                        System.out.println("Você errou. Era " + resultadoEsperado + ".");
                        erro = true;
                    }
                }
            }

            if (!erro) {
                System.out.println("Parabéns! Você completou todas as tabuadas sem erros. 🎉");
            }

            System.out.print("Deseja jogar novamente? (s/n) ");
            jogarNovamente = scanner.next();

        } while (jogarNovamente.equalsIgnoreCase("s"));
    }
}
