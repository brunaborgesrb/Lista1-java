//Receba um número decimal do usuário e calcule o seu quadrado.

import java.util.Scanner;

public class exe5 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float numero, quadrado;
        System.out.println("informe um número decimal: ");
        numero = input.nextFloat();

        quadrado = numero * numero;
        System.out.println("o quadrado do número " + numero + " é: " + quadrado);

    }
}