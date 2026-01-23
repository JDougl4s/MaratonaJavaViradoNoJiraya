package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos cavalos foram comprados?");
        int quantidadeCavalos = sc.nextInt();
        int ferraduras = quantidadeCavalos * 4;
        System.out.println("São necessárias "+ferraduras+" ferraduras.");

        sc.close();
    }
}
