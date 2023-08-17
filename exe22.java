/*Receba uma string contendo um número inteiro e some 10 a esse número, convertendo-o
novamente para uma string antes de exibi-lo. */

import java.util.Scanner;

public class exe22 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numeroString, resulString;
        int numeroInt, result;
        System.out.println("insira um número inteiro: ");
        numeroString = input.nextLine();

        numeroInt = Integer.parseInt(numeroString); //transforma p inteiro
        result = numeroInt + 10;
        resulString = Integer.toString(result); //transforma dnv p inteiro 

        System.out.println("número original: " + numeroString);
        System.out.println("resultado somando com 10: " + resulString);

    }
}
