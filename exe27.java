/*Receba o nome de um produto digitado pelo usuário e concatene-o com o preço do produto,
adicionando o símbolo de moeda da sua escolha. */

import java.util.Scanner;

public class exe27 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nomeProd, simbolo, concatenacao;
        double preçoProd;
        System.out.println("insira o nome de algum produto: ");
        nomeProd = input.nextLine();
        System.out.println("insira o preço desse produto: ");
        preçoProd = input.nextDouble();
        input.nextLine();
        System.out.println("qual o simbolo da moeda? ");
        simbolo = input.nextLine();

        concatenacao = (nomeProd + "/ " + simbolo + preçoProd);
        System.out.println(concatenacao);
    }
}
