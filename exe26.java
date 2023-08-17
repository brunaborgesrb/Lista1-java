/*Receba um número inteiro e uma string do usuário. Em seguida, concatene-os em uma única
string, separando-os com um espaço. */

import java.util.Scanner;

public class exe26 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        String nome, concatenado;
        System.out.println("insira um numero inteiro: ");
        numero = input.nextInt();
        input.nextLine(); 
        System.out.println("insira uma palavra, frase ou numero: ");
        nome = input.nextLine();

        concatenado = numero + " " + nome;
        System.out.println(concatenado);
    }
}
