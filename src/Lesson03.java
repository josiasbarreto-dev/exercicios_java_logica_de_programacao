/* 3) Implemente um jogo Jokenpo (Pedra, papel ou tesoura). Será o
jogador contra a máquina. O código tem que gerar as posições
aleatoriamente e comparar com o que escolhemos. */

import java.util.Random;
import java.util.Scanner;

public class Lesson03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int chooseExit;

        do {
            exibirTelaInicial();
            int choosePlayer = sc.nextInt();

            int chooseMachine = random.nextInt(3) + 1;

            System.out.println("=====================================");
            System.out.println("A máquina escolheu: " + chooseMachine);
            System.out.println("=====================================");
            System.out.println(chooseMachine);

            if (choosePlayer == chooseMachine) {
                System.out.println("Empate! Ambos escolheram " + choosePlayer);
            } else if ((choosePlayer == 1 && chooseMachine == 3) ||
                    (choosePlayer == 2 && chooseMachine == 1) ||
                    (choosePlayer == 3 && chooseMachine == 2)) {
                System.out.println("Você ganhou! Escolha do Jogador " + choosePlayer + " vence escolha da Máquina " + chooseMachine);
            } else {
                System.out.println("Você perdeu!");
            }
            System.out.println("Para continuar pressione qualquer Tecla Numérica ou Pressione 0 para sair!");
            chooseExit = sc.nextInt();
        } while (chooseExit != 0);

    }

    public static void exibirTelaInicial() {
        System.out.println("=====================================");
        System.out.println("        BEM-VINDO AO JOKENPÔ       ");
        System.out.println("=====================================");
        System.out.println("     Instruções do Jogo:");
        System.out.println("   1 - Pedra vence Tesoura");
        System.out.println("   2 - Tesoura vence Papel");
        System.out.println("   3 - Papel vence Pedra");
        System.out.println("=====================================");
        System.out.println("     Escolha a sua jogada:");
        System.out.println("     1 - Pedra");
        System.out.println("     2 - Papel");
        System.out.println("     3 - Tesoura");
        System.out.println("=====================================");
    }

}
