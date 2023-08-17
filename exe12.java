//Solicite ao usuário um número inteiro e exiba se ele é par ou ímpar. 

import java.util.Scanner;

public class exe12 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        System.out.println("informe um número: ");
        numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println("o numero é par");
        }
        else {
            System.out.println("o número é ímpar");
        }


    }
    
}
