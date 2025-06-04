import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = getOption(scan);

        int number1 = obterNumero1(scan);
        int number2 = obterNumero2(scan);

        switch (option){
            case 1:
                System.out.println("Soma");
                System.out.println(somar(number1, number2));
                break;
            case 2:
                System.out.println("Subtração");
                System.out.println(subtrair(number1, number2));
                break;
            case 3:
                System.out.println("Multiplicação");
                System.out.println(multiplicar(number1, number2));
                break;
            case 4:
                System.out.println("Divisão");
                System.out.println(dividir(number1, number2));
                break;
            case 5:
                System.out.println("Potenciação");
                System.out.println(calcularPotencia(number1, number2));
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

    public static int getOption(Scanner scan){
        System.out.println("-----------------------------------------------");
        System.out.println("------------- Calculadora Padrão --------------");
        System.out.println("-----------------------------------------------");
        System.out.println("ESCOLHA A OPERAÇÃO DESEJADA:");
        System.out.println("1) Soma (+)");
        System.out.println("2) Subtração (-)");
        System.out.println("3) Multiplicação (*)");
        System.out.println("4) Divisão (/)");
        System.out.println("5) Potenciação (^)");

        return scan.nextInt();
    }

    public static int obterNumero1(Scanner scan){
        System.out.println("Escolha o número 1:");
        return scan.nextInt();
    }

    public static int obterNumero2(Scanner scan){
        System.out.println("Escolha o número 2:");
        return scan.nextInt();
    }

    public static int somar(int number1, int number2){
        return number1 + number2;
    }

    public static int subtrair(int number1, int number2){
        return number1 - number2;
    }

    public static int multiplicar(int number1, int number2){
        return number1 * number2;
    }

    public static int dividir(int number1, int number2){
        if (number2 == 0) {
            System.out.println("Divisão por zero não é permitida.");
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return number1 / number2;
    }

    public static int calcularPotencia(int base, int expoente) {
              return (int) Math.pow(base, expoente);
    }
}
