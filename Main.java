package aula02;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Insira seu nome:");
    String nome = sc.nextLine();
    System.out.println(nome);

    System.out.println("Insira sua idade:");
    int idade = sc.nextInt();
    System.out.println(idade);

    System.out.println("Insira sua altura:");
    double altura = sc.nextDouble();
    System.out.println(altura);

    System.out.println("Nome | " + nome    + "     " + " Idade |  " + idade   +"      " + " Altura |  " +   altura);
    sc.close();
    }
}