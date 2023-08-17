//Receba três números inteiros digitados pelo usuário e exiba o resultado da operação (n1 + n2) * n3.

import java.util.Scanner;

public class exe38 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, num3, operacao;
        System.out.println("insira o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("insira o segundo número: ");
        num2 = input.nextInt();
        System.out.println("insira o terceiro número: ");
        num3 = input.nextInt();

        operacao = (num1 + num2) * num3;
        System.out.println("o resultado da operação é: " + operacao);
    }
    
}
