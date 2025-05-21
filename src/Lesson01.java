// 1) Definir a idade de uma pessoa e verificar se ela é maior de idade ou não.
public class Lesson01 {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18){
            System.out.println("Pessoa maior de idade - Adulto -> " + age);
        } else {
            System.out.println("Pessoa menor de idade - Adolescente " + age);
        }
    }
}