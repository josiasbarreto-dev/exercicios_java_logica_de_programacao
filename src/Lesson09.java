public class Lesson09 {
    public static void main (String[] args){
        int number = 25;

        // to do
    }
    public static int fibonacci(int number){
        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number -2);
    }
}
