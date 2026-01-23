package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Qual sua idade:");
        int idade = sc.nextInt();

        int totalDeDias = idade * 365;
        System.out.println(nome+", você já viveu "+totalDeDias+" dias.");

        sc.close();
    }
}
