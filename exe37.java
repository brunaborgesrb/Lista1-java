//Solicite ao usuário para digitar um número decimal e arredonde-o para o inteiro mais próximo.

import java.util.Scanner;

public class exe37 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float numDec;
        int numInt;
        System.out.println("insira um número decimal: ");
        numDec = input.nextFloat();

        numInt = (int) Math.round(numDec);
        System.out.println("o valor arredondado é: " + numInt);
    }
}
