//17) Faça um programa para representar a árvore genealógica de
//uma família. Para tal crie uma classe Pessoa que permita indicar
//além de nome e idade, o pai e a mãe. Tenha em mente que pai e
//mãe também são do tipo Pessoa
package ArvoreGenealogica;

public class Person {
    private String name;
    private int age;
    private Person mother;
    private Person father;

    public Person(String name, int age, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void printTree(){
        System.out.println("Name: " + name + ", Age: " + age);

        if (father != null){
            System.out.println("Father: " + father.getName());
        } else{
            System.out.println("Unknown father");
        }

        if (mother != null){
            System.out.println("Name: " + mother.getName());
        } else{
            System.out.println("Unknown mother");
        }
    }
}
