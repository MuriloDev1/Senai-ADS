public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};

        for(int i=0; i< numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.print("\n");
        for (int j = numbers.length -1; j>=0 ; j--) {
            System.out.print(numbers[j]);
        }
    }
}
