import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c, equacao;
        System.out.println("Digite os coeficientes para calcular uma equação de segundo grau: (separados por espaço)");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (a == 0)
            System.out.println("Não é uma equação de segundo grau");
        else {
            double delta = (b * b) - 4 * a * c;

            if (delta < 0)
                System.out.println("A equeação não possui raízes reais");
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("As raízes da equação são: x₁ = %.2f, x₂ = %.2f\n", x1, x2);

            }
        }



    }
}