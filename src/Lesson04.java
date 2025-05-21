import java.util.Scanner;

/* 4) Implemente o programa da calculadora utilizando uma instrução
switch-case para determinar a operação que deve ser executada,
conforme o usuário escolheu no menu de opções */
public class Lesson04 {
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
                break;
            case 2:
                System.out.println("Subtração");
                break;
            case 3:
                System.out.println("Multiplicação");
                break;
            case 4:
                System.out.println("Divisão");
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }
}
