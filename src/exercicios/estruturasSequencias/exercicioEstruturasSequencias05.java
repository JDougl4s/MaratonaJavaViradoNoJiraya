package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preço do litro da gasolina:");
        double precoDoLitroDaGasolina = sc.nextDouble();

        System.out.println("Quanto você irá pagar:");
        double valorPagamento = sc.nextDouble();

        double litros = valorPagamento / precoDoLitroDaGasolina;
        System.out.println("Você encheu "+(int) litros+" litros de gasolina");

        sc.close();
    }
}
