package aula02;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira seu peso:");
    Double peso = sc.nextDouble();


    System.out.println("Insira sua altura:");
    Double altura = sc.nextDouble();



    double imc= peso/(altura*altura);
    System.out.println(imc);

    if (imc<18.5) {
        System.out.println("Você está abaixo do peso");
    } else if (imc>20) {
        System.out.println("Seu peso é Normal");
    }


    }







}
