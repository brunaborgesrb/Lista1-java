/*Peça ao usuário que digite a sua cidade e verifique se ela começa com a letra "S" (ou outra letra de
sua escolha). */

import java.util.Scanner;

public class exe19 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String cidade;
        System.out.println("informe a sua cidade: ");
        cidade = input.nextLine();

        if (cidade.startsWith("S") || cidade.startsWith(cidade)){ //para verificar se a string inserida pelo usuário começa com a letra "S"
            System.out.println("a sua cidade começa com a letra S");
        }
        else {
            System.out.println("a sua cidade não começa com a letra S");
        }

    }
}
