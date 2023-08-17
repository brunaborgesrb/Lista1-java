/*Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule e exiba o
perímetro do retângulo. */

import java.util.Scanner;

public class exe33 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double base, altura, perimetro;
        System.out.println("insira a base de um retângulo: ");
        base = input.nextDouble();
        System.out.println("insira a altura do retângulo: ");
        altura = input.nextDouble();

        perimetro = 2 * (base + altura);
        System.out.println("o perímetro do retângulo é: " + perimetro);
        
    }
}
