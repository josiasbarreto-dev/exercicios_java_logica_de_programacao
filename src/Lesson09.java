import java.util.Scanner;

public class Lesson09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número limite para a sequência de Fibonacci: ");
        int limite = sc.nextInt();

        System.out.println("Sequência de Fibonacci até " + limite + ":");

        int a = 0, b = 1;

        while (a <= limite) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        sc.close();
    }
}
