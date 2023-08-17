//Peça ao usuário que digite sua idade em texto (por exemplo, "18") e converta-a em um número inteiro.

import java.util.Scanner;

public class exe2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String idade;
        int idadeInt;
        System.out.println("informe sua idade em texto: ");
        idade = input.nextLine();

        idadeInt = Integer.parseInt(idade);
        System.out.println("a idade convertida em um número inteiro é: " + idadeInt);
    }
}