/*Peça ao usuário para digitar a sua idade e, em seguida, informe quantos meses e quantos dias ele já
viveu (considerando um ano com 365 dias). */

import java.util.Scanner;

public class exe35 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int idade, meses, dias;
        System.out.println("digite sua idade: ");
        idade = input.nextInt();

        // calcula quantos meses e dias o usuário viveu
        meses = idade * 12;
        dias = idade * 365;

        System.out.println("você viveu " + meses + " meses e " + dias + " dias");
    }
}
