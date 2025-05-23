//14) Leia do usuário o tempo em segundos e escreva em horas,
//        minutos e segundos. Utilize cinco métodos, para a leitura e escrita
//        de dados e para obtenção de horas, minutos e segundos a partir
//        do tempo em segundos.
//        Ex: 7023 segundos equivalem a 1h57min3seg.

import java.util.Scanner;

public class TimeSeconds {

    private int timeInSeconds;

    public static void main(String[] args) {
        TimeSeconds t = new TimeSeconds();
        t.getSecondsUser();
        System.out.println(t);
    }

    public void getSecondsUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tempo em segundos:");
        this.timeInSeconds = sc.nextInt();
    }

    public int convertTimeToHours(){
        final int SECONDS_PER_HOUR = 3600;
        return timeInSeconds / SECONDS_PER_HOUR;
    }

    public int convertTimeToMinutes(){
        final int SECONDS_PER_MINUTES = 60;
        final int SECONDS_PER_HOUR = 3600;
        int rest = timeInSeconds % SECONDS_PER_HOUR;

        return rest / SECONDS_PER_MINUTES;
    }

    public int  getSeconds(){
        final int SECONDS_PER_HOUR = 3600;
        int rest = timeInSeconds % SECONDS_PER_HOUR;

        return rest % 60;
    }


    @Override
    public String toString() {
        return timeInSeconds + " segundos equivalem a " +
                convertTimeToHours() + "h" + convertTimeToMinutes() + "min" + getSeconds() + "seg";
    }
}
