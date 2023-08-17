//Receba um número inteiro digitado pelo usuário e verifique se ele é positivo ou negativo. 

import java.util.Scanner;

public class exe13 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("informe um número: ");
        numero = input.nextInt();

        if (numero > 0){
            System.out.println("o número é positivo");
        }
        else if (numero < 0 ){
            System.out.println("o número é negativo");
        }
        else{
            System.out.println("o número é zero");
        }
    }
}
