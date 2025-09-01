package aula02;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite 1,2 ou 3");
    int x = sc.nextInt();
    switch (x) {
        case 1:
            System.out.println("Opção 1 Escolhida");
        break;
        case 2:
            System.out.println("Opção 2 Escolhida");
        break;
        case 3:
            System.out.println("Opção 3 escolhida");
        break;
        default:
            System.out.println("Opção invalida");

    }
     sc.close();




    }






}
