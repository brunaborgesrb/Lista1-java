/*Solicite ao usuário que insira três números decimais. Em seguida, calcule e exiba a média
aritmética desses números. */

import java.util.Scanner;

public class exe34 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float num1, num2, num3, media;
        System.out.println("insira o primeiro número: ");
        num1 = input.nextFloat();
        System.out.println("insira o segundo número: ");
        num2 = input.nextFloat();
        System.out.println("insira o segundo número: ");
        num3 = input.nextFloat();

        media = (num1 + num2 + num3) / 3;
        System.out.println("a média aritmética é: " + media);

    }
}
