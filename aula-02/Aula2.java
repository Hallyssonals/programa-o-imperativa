import java.util.Scanner;

public class Aula2 {
    public static Scanner input = new Scanner (System.in);
    public static final int ANO_ATUAL = 2026;
    public static void main(String[] args) {
        System.out.println(" Digite sua idade: ");
        int idade = input.nextInt ();
        if (idade >= 18) {
            System.out.println( "Você já pode tirar a CNH!");            
        }
         else {
            System.out.println (" Você não pode tirar CNH");
        }

        if (idade < 16 ) {
            System.out.println ( "Você não pode votar!");

        } else if (idade >= 16 && idade <18) {
            System.out.println ( "Você pode tirar titulo de eleitor e votar!");

        } else if (idade < 70 ){
            System.out.println ( "É obrigatorio ter titulo de eleitor e votar!");

        } else {
            System.out.println ( "Você não tem mais obrigação de votar!");

        }
        int anoNasc = ANO_ATUAL - idade; 
        System.out.println ("Você nasceu provavelmente em " + anoNasc);
        
    }

}