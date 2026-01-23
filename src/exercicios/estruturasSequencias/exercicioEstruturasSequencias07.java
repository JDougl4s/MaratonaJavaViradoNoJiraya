package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia (com 2 digitos):");
        int dia = sc.nextInt();
        System.out.println("Informe o mês (com 2 digitos):");
        int mes = sc.nextInt();

        int totalDeDias = (30 * (mes - 1)) + dia;
        System.out.println("Total de "+totalDeDias+" dias");

        sc.close();
    }
}
