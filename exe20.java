//Solicite ao usuário que insira dois números decimais e calcule o resto da divisão entre eles.

import java.util.Scanner;

public class exe20 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float num1, num2, resto;
        System.out.println("insira um número decimal: ");
        num1 = input.nextFloat();
        System.out.println("insira outro número decimal: ");
        num2 = input.nextFloat();

        resto = num1 % num2;
        System.out.println("o resto da divisão é: " + resto);
    }
}
