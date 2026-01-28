package exercicios.estruturaDeRepeticao;

import java.util.Scanner;

public class exercicioEstruturasDeRepeticao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorInicial = sc.nextInt();
        int razao = sc.nextInt();
        double progressaoGeometrica;

        for (int i = 1; i <= 10; i++) {
            progressaoGeometrica = valorInicial * Math.pow(razao, i - 1);
            System.out.println((int) progressaoGeometrica);
        }

        sc.close();
    }
}
