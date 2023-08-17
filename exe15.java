/*Receba a altura e o peso de uma pessoa digitados pelo usuário. Em seguida, calcule o seu índice de
massa corporal (IMC) utilizando a fórmula: IMC = peso / (altura * altura) e exiba o resultado. */

import java.util.Scanner;

public class exe15 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, peso, imc;
        System.out.println("informe sua altura: ");
        altura = input.nextDouble();
        System.out.println("informe seu peso: ");
        peso = input.nextDouble();

        imc = peso / (altura * altura);
        System.out.println("seu imc é: " + imc);
    }
}
