/* Receba uma string digitada pelo usuário e imprima o seu tamanho (número de caracteres).*/

import java.util.Scanner;

public class exe11 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome;
        int tamanho;
        System.out.println("informe uma string: ");
        nome = input.nextLine();

        tamanho = nome.length(); //obter o tamanho (número de caracteres) da string


        System.out.println("o nome " + nome + " tem " + tamanho + " caracteres");
    }
}