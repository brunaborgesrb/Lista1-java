//Peça ao usuário para digitar dois números inteiros e exiba a soma deles.

import java.util.Scanner;

public class exe4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, soma;
        System.out.println("informe um número: ");
        num1 = input.nextInt();
        System.out.println("informe outro número: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        System.out.println("a soma dos dois números é " + soma);
    }
}