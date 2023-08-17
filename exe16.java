//Peça ao usuário que digite o seu nome e verifique se ele contém mais de 5 caracteres.

import java.util.Scanner;

public class exe16 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome;
        System.out.println("informe seu nome: ");
        nome = input.nextLine();

        if (nome.length() > 5){
            System.out.println("o nome tem mais de 5 caracteres");
        }
        else{
            System.out.println("o nome tem menos de 5 caracteres");
        }
    }
}