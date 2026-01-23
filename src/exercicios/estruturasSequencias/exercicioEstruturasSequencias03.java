package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Total de pães comprados no dia:");
        int quantidadePaes = sc.nextInt();
        System.out.println("Total de broas compradas no dia:");
        int quantidadeBroas = sc.nextInt();

        double valorFinalDoDia = (quantidadePaes * 0.12) + (quantidadeBroas * 1.50);
        System.out.println("Foram arrecadados o total de: "+valorFinalDoDia);

        double poupanca = valorFinalDoDia * 0.1;
        System.out.println("Você deve guardar o total de: "+poupanca);


        sc.close();
    }
}
