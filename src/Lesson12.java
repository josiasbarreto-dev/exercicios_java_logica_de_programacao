import java.util.Arrays;
import java.util.Random;

/* 12) Crie dois vetores de 50 posições com valores inteiros aleatórios,
ordene cada vetor individualmente, e combine os dois vetores
gerando um novo vetor de 100 posições, ordenando esse novo. */
public class Lesson12 {
    public static void main(String[] args) {
        int[] vector1 = new int[50];
        int[] vector2 = new int[50];

        int[] randomVector1 = generateRandomNumbers(vector1);
        int[] randomVector2 = generateRandomNumbers(vector2);

        int[] mergedVector = mergeArrays(randomVector1, randomVector2);
        Arrays.sort(mergedVector);

        System.out.println(Arrays.toString(mergedVector));
    }

    public static int[] generateRandomNumbers(int[] vector){
        Random random = new Random();
        for (int i = 0; i < vector.length ; i++){
            int numberRandom = random.nextInt(101);
            vector[i] = numberRandom;

        }
        return vector;
    }

    public static int[] mergeArrays(int[] vector1, int[] vector2) {
        int[] mergedArray = new int[vector1.length + vector2.length];

        System.arraycopy(vector1, 0, mergedArray, 0, vector1.length);
        System.arraycopy(vector2, 0, mergedArray, vector1.length, vector2.length);

        return mergedArray;
    }
}
