/*Solicite ao usuário que insira seu ano de nascimento e concatene-o com uma mensagem de
boas-vindas, como "Bem-vindo ao nosso programa, nascido em [ano de nascimento]!". */

import java.util.Scanner;

public class exe25 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int anoNasc;
        System.out.println("insira o seu ano de nascimento: ");
        anoNasc = input.nextInt();

        System.out.println("Bem-vindo ao nosso programa, nascido em " + anoNasc + "!");
    }

}
