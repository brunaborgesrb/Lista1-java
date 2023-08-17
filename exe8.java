/*Solicite ao usuário uma sequência de números separados por espaço e exiba quantos números
foram digitados. */

import java.util.Scanner;

public class exe8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numSequencia;
        int qtdNumeros;
        System.out.println("digite uma sequencia de números separados por espaço: ");
        numSequencia = input.nextLine();

        String[] numeros = numSequencia.split(" "); //dividir a linha em um array de strings, onde cada elemento corresponde a um número digitado
        qtdNumeros = numeros.length;

        System.out.println("foram digitados " + qtdNumeros + " números");
    }
}