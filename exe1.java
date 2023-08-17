//Solicite ao usuário seu nome e imprima uma mensagem de boas-vindas na tela.

import java.util.Scanner;

public class exe1 {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nome;
    System.out.println("informe seu nome: ");
    nome = input.nextLine();

    System.out.println("Seja bem vinda(o), " + nome + "!");
}
}