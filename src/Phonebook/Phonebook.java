//19) Implemente um sistema de agenda telefônica. Faça (ao menos)
//as interações de adicionar e deletar números.
package Phonebook;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<>();
    }

    public void saveContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contato adicionado: " + contact);
    }

    public boolean deleteContact(String nome) {
        for (Contact c : contacts) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contacts.remove(c);
                System.out.println("Contato removido: " + c);
                return true;
            }
        }
        System.out.println("Contato não encontrado com o nome: " + nome);
        return false;
    }

    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Agenda vazia.");
            return;
        }
        System.out.println("Contatos da agenda:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

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
