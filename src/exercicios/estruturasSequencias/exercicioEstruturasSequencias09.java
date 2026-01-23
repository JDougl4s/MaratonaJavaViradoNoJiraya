package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quais foram as quantidades de camisas pequenas:");
        int camisaPequenas = sc.nextInt();
        System.out.println("Quais foram as quantidades de camisas médias:");
        int camisaMedias = sc.nextInt();
        System.out.println("Quais foram as quantidades de camisas grandes:");
        int camisaGrandes = sc.nextInt();

        double valorArrecadado = (camisaPequenas * 10) + (camisaMedias * 12) + (camisaGrandes * 15);
        System.out.printf("O valor total arrecadado foi de: R$%.2f", valorArrecadado);


        sc.close();
    }
}
