import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c;

        System.out.println("Digite o valor do coeficiente - A");
        a = scanner.nextFloat();

        System.out.println("Digite o valor do coeficiente - B");
        b = scanner.nextFloat();

        System.out.println("Digite o valor do coeficiente - C");
        c = scanner.nextFloat();


        formulaEquacao(a,b,c);
    }

    public static void formulaEquacao (float a, float b, float c) {
        float delta = b * b - 4*a*c;

        if (delta < 0 ) {
            System.out.println("Não existe raízes reais");
        } else if (delta == 0) {
           float x = -b / (2*a);
            System.out.printf("A equação tem raíz = %.2f%n", x);
        }  else {
            float raizDelta = (float) Math.sqrt(delta);
            float x1 = (-b + raizDelta) / (2 * a);
            float x2 = (-b - raizDelta) / (2 * a);
            System.out.printf("A equação tem duas raízes reais: x1 = %.2f e x2 = %.2f%n", x1, x2);
        }
    }
}