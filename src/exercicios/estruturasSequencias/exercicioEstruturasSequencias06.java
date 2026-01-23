package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o peso do prato montado (em kg):");
        double pesoDoPrato = sc.nextDouble();

        double valorFinal = pesoDoPrato * 12.00;
        System.out.printf("Total á pagar: R$%.2f", valorFinal);



        sc.close();
    }
}
