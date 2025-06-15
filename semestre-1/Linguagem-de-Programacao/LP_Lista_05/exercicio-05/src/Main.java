public class Main {
    public static void main(String[] args) {

        int[] vetor = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] aux = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            aux[i] = vetor[vetor.length - 1 - i];
        }

        System.out.print("Vetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nVetor invertido: ");
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
    }
}
