package aula02;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
       String r;
       Scanner sc = new Scanner(System.in);
       do {
           System.out.println("Caso escolha 1: café da manhã, Caso escolha 2: Almoço");
           int x = sc.nextInt();
           switch (x) {
               case 1:
                   System.out.println("Bom dia! Nosso café da manhã será servido das 6h às 10h!");
                   break;
               case 2:
                   System.out.println("Nosso restaurante abrirá a partir das 13h");
                   break;

               default:
                   System.out.println("Opção Inválida!");
           }
           System.out.println("Para ver novamente, digite 5");
           r = sc.next();
       }   while(r.equalsIgnoreCase("5"));





    }



}
