/* 6) Gere 10 números aleatórios entre 0 e 100; mostre todos na tela
        (em uma única linha); identifique o menor e o maior deles. */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lesson06 {
    public static void main (String[] args){
        Random random = new Random();
        Map<Integer, Integer> mapNumerosAleatorios = new HashMap<>() {};

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1 ; i <= 10 ; i++){
            int num = random.nextInt(101);
            mapNumerosAleatorios.put(i, num);

            if (num < minNumber) {
                minNumber = num;
            }
            if (num > maxNumber){
                maxNumber = num;
            }
        }
        System.out.println("Número aleatório -> " + mapNumerosAleatorios);
        System.out.println("Menor número: " + minNumber);
        System.out.println("Maior número: " + maxNumber);

    }
}
