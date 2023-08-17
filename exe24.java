/*Receba o nome de uma cidade do usuário e concatene-o com o nome do estado para formar uma
mensagem completa, como "Você mora em [cidade], [estado].". */

import java.util.Scanner;

public class exe24 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String cidade, estado;
        System.out.println("em que estado você mora? ");
        estado = input.nextLine();
        System.out.println("e a cidade? ");
        cidade = input.nextLine();

        System.out.println("Você mora em " + cidade + ", " + estado + ".");
    }
    
    
}
