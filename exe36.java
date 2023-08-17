/*Receba um valor em reais e a cotação do dólar digitados pelo usuário. Em seguida, converta o valor
para dólares e exiba o resultado. */

import java.util.Scanner;

public class exe36 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double valReal, cotDolar, valDolar;
        System.out.println("insira um valor em reais: ");
        valReal = input.nextDouble();
        System.out.println("insira a cotação do dólar: ");
        cotDolar = input.nextDouble();

        valDolar = valReal / cotDolar; 
        System.out.println("o valor em dólar é: " + valDolar);

    }
}
