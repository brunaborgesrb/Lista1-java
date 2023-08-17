/*Peça ao usuário para digitar a base e a altura de um triângulo. Em seguida, calcule e exiba a área do
triângulo. */

import java.util.Scanner;

public class exe31 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double base, altura, area;
        System.out.println("informe a base do triângulo: ");
        base = input.nextDouble();
        System.out.println("informe a altura do triângulo: ");
        altura = input.nextDouble();

        area = (base * altura) / 2;
        System.out.println("a área do triângulo é: " + area);

        
    }
    
}
