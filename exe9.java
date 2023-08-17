/*Receba o nome de um animal digitado pelo usuário e exiba uma mensagem informando qual
animal foi digitado. */

import java.util.Scanner;

public class exe9 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String animal;
        System.out.println("digite o nome de algum animal: ");
        animal = input.nextLine();

        System.out.println("o animal digitado foi: " + animal);
    }
}