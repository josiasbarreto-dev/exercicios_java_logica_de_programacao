/* 2) Para cada produto informado (nome, preço e quantidade), escreva o
nome do produto comprado e o valor total a ser pago, considerando
que são oferecidos descontos pelo número de unidades compradas,
segundo a tabela abaixo:
a. Até 10 unidades: valor total
b. De 11 a 20 unidades: 10% de desconto
c. De 21 a 50 unidades: 20% de desconto
d. Acima de 50 unidades: 25% de desconto */

import java.util.Scanner;

public class Lesson02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Favor inserir o nome do Produto -> ");
        String name = sc.nextLine();

        System.out.print("Qual o preço do Produto? -> ");
        float price = sc.nextFloat();

        System.out.print("Qual a quantidade do Produto? -> ");
        int amount = sc.nextInt();

        if (amount > 0 && amount <= 10){
            float total = calculateDiscount (0, price, amount);
            System.out.println("Produto Adquirido" + name + "Total R$ " + total);
        } else if (amount <= 20){
            float total = calculateDiscount (10, price, amount);
            System.out.printf("Produto Adquirido: %s - Total: R$ %.2f \n", name, total);
        } else if (amount <= 50){
            float total = calculateDiscount (20, price, amount);
            System.out.println("Total R$ " + total);
        } else {
            float total = calculateDiscount (25, price, amount);
            System.out.println("Total R$ " + total);
        }

    }
    private static float calculateDiscount(int percent, float price, int amount){
        if (percent == 0){
            return price * amount;
        }
        float discount = (price * percent / 100) * amount;
        return (price * amount) - discount;
    }
}
