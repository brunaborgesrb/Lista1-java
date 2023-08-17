/*Peça ao usuário que digite uma temperatura em graus Celsius e a converta para Fahrenheit usando
a fórmula: Fahrenheit = (Celsius * 9/5) + 32. */

import java.util.Scanner;

public class exe39 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tempCelsius, tempFahrenheit;
        System.out.println("digite uma temperatura em graus Celsius: ");
        tempCelsius = input.nextInt();

        tempFahrenheit = (tempCelsius * 9/5) + 32;
        System.out.println("a temperatuda convertida para Fahrenheit é: " + tempFahrenheit);
    }
}
