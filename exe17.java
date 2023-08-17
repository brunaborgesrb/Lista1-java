/*Solicite ao usuário que insira o seu estado civil e exiba uma mensagem apropriada (por exemplo:
"Você é casado(a)", "Você é solteiro(a)", etc.). */

import java.util.Scanner;

public class exe17 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String estadoCivil;
        System.out.println("insira o seu estado civil: ");
        estadoCivil = input.nextLine();

        switch (estadoCivil.toLowerCase()){
            case "casado":
                System.out.println("você é casado");
            break;
            case "solteiro":
                System.out.println("você é solteiro");
            break;
            case "divorciado":
                System.out.println("você é divorciado");
            break;
            case "viuvo":
                System.out.println("você é viuvo");
            break;
            default:
                System.out.println("estado civil não reconhecido. tente novamente");
        }
    }
}
