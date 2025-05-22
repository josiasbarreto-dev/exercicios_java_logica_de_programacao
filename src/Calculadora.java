import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("------------- Calculadora Padrão --------------");
        System.out.println("-----------------------------------------------");
        System.out.println("ESCOLHA A OPERAÇÃO DESEJADA:");
        System.out.println("1) Soma (+)");
        System.out.println("2) Subtração (-)");
        System.out.println("3) Multiplicação (*)");
        System.out.println("4) Divisão (/)");
        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("Soma");

                System.out.println("Escolha o número 1:");
                int n1 = sc.nextInt();

                System.out.println("Escolha o número 2:");
                int n2 = sc.nextInt();

                System.out.println(somar(n1, n2));
                break;
            case 2:
                System.out.println("Subtração");

                System.out.println("Escolha o número 1:");
                n1 = sc.nextInt();

                System.out.println("Escolha o número 2:");
                n2 = sc.nextInt();

                System.out.println(subtrair(n1, n2));
                break;
            case 3:
                System.out.println("Multiplicação");

                System.out.println("Escolha o número 1:");
                n1 = sc.nextInt();

                System.out.println("Escolha o número 2:");
                n2 = sc.nextInt();

                System.out.println(multiplicar(n1, n2));
                break;
            case 4:
                System.out.println("Divisão");

                System.out.println("Escolha o número 1:");
                n1 = sc.nextInt();

                System.out.println("Escolha o número 2:");
                n2 = sc.nextInt();

                System.out.println(dividir(n1, n2));
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

    public static int somar(int n1, int n2){
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2){
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2){
        return n1 * n2;
    }

    public static int dividir(int n1, int n2){
        return n1 / n2;
    }
}
