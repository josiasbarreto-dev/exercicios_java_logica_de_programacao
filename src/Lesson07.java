import java.util.Scanner;

/* 7) Calcule a série de Fibonacci para um número inteiro não negativo
informado pelo usuário. A série de Fibonacci inicia com os
números F0 = 0 e F1 = 1, e cada número posterior equivale à soma
dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso
o usuário informe o número 9, o resultado seria 0, 1, 1, 2, 3, 5,
        8, 13, 21, 34 */
public class Lesson07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("\nInforme o número desejado para a sequência fibonacci:");
            n = sc.nextInt();

            System.out.println("Sequência de Fibonacci até o termo " + n + ":");

            for (int i = 0; i < n; i++) {
                System.out.print(Fibonacci(i) + " ");
            }
        } while (n > 0);
    }
    public static int Fibonacci (int number){
        if (number == 0){
            return 0;
        }

        if (number == 1){
            return 1;
        }
        return Fibonacci(number-1) + Fibonacci(number-2);

    }
}
