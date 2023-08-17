//Receba um número inteiro do usuário e converta-o em um número decimal (float).

import java.util.Scanner;

public class exe3{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        float numDec;
        System.out.println("informe um número inteiro: ");
        numero = input.nextInt();

        numDec = (float) numero;
        System.out.println("o número em decimal é: " + numDec);
    }

}