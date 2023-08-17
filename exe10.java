/*Peça ao usuário que digite o seu nome e o seu sobrenome. Em seguida, exiba o nome completo
invertido (sobrenome, nome). */

import java.util.Scanner;

public class exe10 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome, sobrenome;
        System.out.println("informe seu nome: ");
        nome = input.nextLine();
        System.out.println("informe seu sobrenome: ");
        sobrenome = input.nextLine();

        System.out.println("nome completo invertido: " + sobrenome + " " + " nome");
    }
}