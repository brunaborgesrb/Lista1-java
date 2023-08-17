/*Solicite ao usuário que digite uma data no formato "dd/mm/aaaa" e extraia o dia, o mês e o ano
separadamente, convertendo-os em números inteiros. */

import java.util.Scanner;

public class exe23 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String data;
        int dia, mes, ano;
        System.out.println("digite uma data no formato 'dd/mm/aaaa': ");
        data = input.nextLine();

        String[] dataSeparadas = data.split("/"); //dividir a string da data em três partes: dia, mês e ano

        dia = Integer.parseInt(dataSeparadas[0]);
        mes = Integer.parseInt(dataSeparadas[1]); //convertendo p int 
        ano = Integer.parseInt(dataSeparadas[2]);

        System.out.println("dia: " + dia + ", " + "mês: " + mes + ", " + "ano: " + ano);
    }
}
