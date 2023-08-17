/*Receba um número inteiro do usuário e concatene-o com uma mensagem, informando o dobro
desse número. */

import java.util.Scanner;

public class exe28 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, concatenacao;
        System.out.println("insira um número inteiro: ");
        numero = input.nextInt();

        concatenacao = numero*2;
        System.out.println("o dobro: " + concatenacao);
    }
}
