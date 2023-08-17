//Peça ao usuário que insira dois números e exiba o maior deles.

import java.util.Scanner;

public class exe14 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2;
        System.out.println("informe um número: ");
        num1 = input.nextInt();
        System.out.println("informe outro número: ");
        num2 = input.nextInt();

        if (num1 < num2){
            System.out.println("o número 2 é maior que o número 1");
        }
        else if (num1 > num2){
            System.out.println("o número 1 é maior que o número 2");
        }
        else {
            System.out.println("os números são iguais");
        }
    }
}
