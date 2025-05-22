/* 10) Leia uma matriz quadrada e determine a soma da diagonal
principal. */

import java.util.Scanner;

public class Lesson10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz quadrada (n): ");
        int n = sc.nextInt();

        int[][] matriz = lerMatriz(n);
        int resultado = somaDiagonalPrincipal(matriz);

        System.out.println("A soma da diagonal principal é: " + resultado);
    }


    public static int[][] lerMatriz(int n) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz " + n + "x" + n + ":");

        for (int i = 0; i < n; i++) {
            System.out.print("Digite os elementos da linha " + (i + 1) + " separados por espaço: ");
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static int somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            soma += matriz[i][i];
        }

        return soma;
    }
}
