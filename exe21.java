//Solicite ao usuário um número decimal e converta-o em um número inteiro.

import java.util.Scanner;

public class exe21 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float numDec;
        int numInt;
        System.out.println("insira um número decimal: ");
        numDec = input.nextFloat();

        numInt = (int) Math.round(numDec); //arredondar o numero

        System.out.println("o número " + numDec + " convertido para inteiro fica: " + numInt);

    }
}
