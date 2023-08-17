/*Peça ao usuário que digite seu primeiro nome e seu sobrenome separadamente. Em seguida,
concatene-os em uma única string e exiba o nome completo. */

import java.util.Scanner;

public class exe7 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome, sobrenome;
        System.out.println("insira seu nome: ");
        nome = input.nextLine();
        System.out.println("insira seu sobrenome: ");
        sobrenome = input.nextLine();

        System.out.println("o nome completo é: " + nome + " " + sobrenome);
    }
}