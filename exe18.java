/*Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule a sua área e
exiba o resultado. */

import java.util.Scanner;

public class exe18 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double base, altura, area;
        System.out.println("insira a base do retângulo: ");
        base = input.nextDouble();
        System.out.println("insira a altura do retângulo: ");
        altura = input.nextDouble();

        area = base * altura;
        System.out.println("a área do retângulo é: " + area);
    }
}
