import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n1, n2;

        System.out.println("Digite dois valores inteiros (separados por espaço): ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        if (n1 > n2)
            System.out.println(n1 +">"+ n2 );
         else if (n1<n2)
            System.out.println(n1 +"<"+ n2);
         else
            System.out.println(n1 +" = "+ n2);
    }
}