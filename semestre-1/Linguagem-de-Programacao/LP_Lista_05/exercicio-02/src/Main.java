public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};

        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                int resultado = numbers[i] * 2;
                System.out.println("Ímpar: " + numbers[i] + " X 2 = "+ resultado);
            } else {
                int resultado = numbers[i] + 2;
                System.out.println("Par: "+ numbers[i] + " + 2 = "+ resultado);
            }
        }
    }
}
