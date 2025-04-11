import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;

        System.out.println("Insira três valores *separados por um espaço");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a<(b+c) && a>Math.abs(b-c) && b<(a+c) && b>Math.abs(a-c) && c<(a+b) && c>Math.abs(a-b)) {
            System.out.println("A, B e C formam um triângulo");
            if (a==b && a==c)
                System.out.println("Triângulo Equilátero");
            else if (a==b || b==c || a==c)
                System.out.println("Triângulo Isósceles");
            else
                System.out.println("Triângulo Escaleno");
        } else
            System.out.println("A, B e C não formam um triângulo");
    }
}