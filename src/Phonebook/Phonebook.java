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
}
