import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = getOption(scan);

        int[] numbers = lerNumeros();

        switch (option){
            case 1:
                System.out.println("Soma");
                System.out.println(somar(numbers[0], numbers[1]));
                break;
            case 2:
                System.out.println("Subtração");
                System.out.println(subtrair(numbers[0], numbers[1]));
                break;
            case 3:
                System.out.println("Multiplicação");
                System.out.println(multiplicar(numbers[0], numbers[1]));
                break;
            case 4:
                System.out.println("Divisão");
                System.out.println(dividir(numbers[0], numbers[1]));
                break;
            case 5:
                System.out.println("Potenciação");
                System.out.println(calcularPotencia(numbers[0], numbers[1]));
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

    public static int[] lerNumeros(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o número 1:");
        int number1 =  scan.nextInt();

        System.out.println("Escolha o número 2:");
        int number2 = scan.nextInt();

        return new int[] {number1, number2};
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
