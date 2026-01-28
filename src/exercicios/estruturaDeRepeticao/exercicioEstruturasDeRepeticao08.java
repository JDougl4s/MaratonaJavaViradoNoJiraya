package exercicios.estruturaDeRepeticao;

import java.util.Scanner;

public class exercicioEstruturasDeRepeticao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorInicial = sc.nextInt();
        int razao = sc.nextInt();
        int progressaoAritmetica;

        for (int i = 1; i <= 10; i++) {
            progressaoAritmetica = valorInicial + ((i - 1)*razao);
            System.out.println(progressaoAritmetica);
        }

        sc.close();
    }
}
