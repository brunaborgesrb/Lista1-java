/*Receba uma string contendo um endereço de e-mail e concatene-a com uma mensagem de
agradecimento personalizada. */

import java.util.Scanner;

public class exe29 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String email;
        System.out.println("insira seu email: ");
        email = input.nextLine();

        System.out.println("E-mail: '" + email + "' enviado! Obrigada");
    }
    
}
