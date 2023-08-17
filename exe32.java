//Receba o raio de uma circunferência digitado pelo usuário e calcule o seu perímetro (2 * π * raio).

import java.util.Scanner;

public class exe32 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double raio, perimetro;
    System.out.println("insira o raio de uma circunferência: ");
    raio = input.nextDouble();

    perimetro = (2 * 3.14 * raio);
    System.out.println("o perímetro é: " + perimetro);

    }
}
