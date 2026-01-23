package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva três notas do aluno:");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double mediaPonderada = (nota1 * 1 + nota2 * 2 + nota3 * 3) / (1+2+3);
        System.out.printf("Sua média ponderada é: %.2f ", mediaPonderada);

        sc.close();
    }
}
