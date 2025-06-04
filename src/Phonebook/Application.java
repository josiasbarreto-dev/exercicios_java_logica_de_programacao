package Phonebook;

public class Application {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Josias", "(22) 99878-3245", "josiasbarreto@gmail.com");
        Contact contact2 = new Contact("Marcos", "(22) 99878-3245", "josiasbarreto@gmail.com");
        Contact contact3 = new Contact("Mateus", "(22) 99878-3245", "josiasbarreto@gmail.com");
        Contact contact4 = new Contact("Davi", "(22) 99878-3245", "josiasbarreto@gmail.com");
        Contact contact5 = new Contact("Maria Júlia", "(22) 99878-3245", "josiasbarreto@gmail.com");

        Phonebook p = new Phonebook();

        p.saveContact(contact1);
        p.saveContact(contact2);
        p.saveContact(contact3);
        p.saveContact(contact4);
        p.saveContact(contact5);

        p.deleteContact("Davi");
        p.listContacts();
    }
}
