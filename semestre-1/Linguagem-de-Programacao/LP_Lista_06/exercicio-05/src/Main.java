import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {2, 5, 8, 10, 14, 20, 25, 30, 35, 40};

        System.out.print("Digite o número que deseja buscar: ");
        int elemento = scanner.nextInt();

        int resultado = buscaBinaria(vetor, elemento);

        if (resultado == -1) {
            System.out.println("Elemento não encontrado no vetor.");
        } else {
            System.out.println("Elemento encontrado na posição: " + resultado);
        }

    }

    public static int buscaBinaria(int[] vetor, int elemento) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == elemento) {
                return meio;
            } else if (vetor[meio] < elemento) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1;
    }
}
