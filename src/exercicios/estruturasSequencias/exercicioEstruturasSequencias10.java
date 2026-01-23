package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores do 1° par ordenado:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Digite os valores do 2° par ordenado:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double raiz = Math.sqrt((Math.pow (x2-x1, 2)) + (Math.pow (y2-y1, 2)));
        System.out.println("A distancia entre os dois pontos é: "+raiz);

        sc.close();
    }
}
