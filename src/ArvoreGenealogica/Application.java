package ArvoreGenealogica;

public class Application {

    public static void main(String[] args) {
        Person maternalGrandmother = new Person("Maria Conceição", 57, null, null);
        Person maternalGrandfather = new Person("João Carlos", 58, null, null);

        Person paternalGrandmother = new Person("Ivanete", 55, null, null);
        Person paternalGrandfather = new Person("Genilso", 50, null, null);

        Person mother = new Person("Thamirys", 28, paternalGrandmother, paternalGrandfather);
        Person father = new Person("Josias", 30, paternalGrandmother, paternalGrandfather);

        Person son = new Person("Davi Lucca", 1, mother, father);

        son.printTree();
    }
}
