/*Receba dois números inteiros do usuário e exiba a soma, a diferença, o produto e o quociente
(divisão inteira) entre eles. */

import java.util.Scanner;

public class exe30 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, soma, diferenca, produto, quociente;
        int num2;
        System.out.println("insira um número: ");
        num1 = input.nextInt();
        System.out.println("insira outro número: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        diferenca = num1 - num2;
        produto = num1 * num2;
        quociente = num1/num2;

        System.out.println("soma: " + soma + " / diferença: " + diferenca + " / produto: " + produto + " / quociente: " + quociente);

    }
    
}
