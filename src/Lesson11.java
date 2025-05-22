import java.util.Arrays;
import java.util.Random;

/* 11) Ordene um vetor de 100 números inteiros gerados
aleatoriamente. (Pesquisar sobre Bubble Sort */
public class Lesson11 {
    public static void main(String[] args) {
        int size = 100;
        int[] vector = new int[size];

        for (int i = 0; i < vector.length ; i++){
            Random random = new Random();
            int numberRandom = random.nextInt(101);
            vector[i] = numberRandom;
        }
        System.out.println(Arrays.toString(sortNumbers(vector)));
    }
    public static int[] sortNumbers(int[] vector) {
        int size = vector.length;

        for (int i=0 ; i < size-1 ; i++){
            for (int j=0 ; j < size - i -1 ; j++){
                if (vector[j] > vector[j+1]){
                    int auxiliar = vector[j];
                        vector[j] = vector[j+1];
                        vector[j+1] = auxiliar;
                }
            }
        }
        return vector;
    }

}
