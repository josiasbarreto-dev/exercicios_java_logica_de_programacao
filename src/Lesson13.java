/*
13) Faça um método que calcule a média de um aluno de acordo
com o critério definido neste curso. Além disso, faça um outro
método que informe o status do aluno de acordo com a tabela a
seguir:
- Nota acima de 6: “Aprovado”
- Nota entre 4 e 6: “Verificação Suplementar”
- Nota abaixo de 4: “Reprovado”
 */
public class Lesson13 {
    public static void main(String[] args) {
        float nota1 = 4.6f;
        float nota2 = 6.9f;

        Lesson13 aluno = new Lesson13();

        float media = aluno.calculateStudentAverage(nota1, nota2);

        System.out.println(media);
        aluno.showStudentStatus(media);
    }

    public float calculateStudentAverage (float nota1, float nota2){
        return (nota1 + nota2) / 2;
    }

    public void showStudentStatus(float nota){
        if (nota < 4){
            System.out.println("Reprovado!");
        }else if (nota >= 4 && nota <= 6){
            System.out.println("Verificação Suplementar!");
        } else{
            System.out.println("Aprovado!");
        }
    }
}
