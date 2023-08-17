//Peça ao usuário que insira o seu ano de nascimento e, em seguida, exiba a sua idade.

import java.time.LocalDate;
import java.util.Scanner;

public class exe6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int anoNasc, idade, anoAtual;
        System.out.println("informe seu ano de nascimento: ");
        anoNasc = input.nextInt();

        anoAtual = LocalDate.now().getYear(); //obter ano atual 
        idade = anoAtual - anoNasc;

        System.out.println("a idade é: " + idade + " anos");
    }
}