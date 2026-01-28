package exercicios.estruturaDeRepeticao;

import java.util.Scanner;

public class exercicioEstruturasDeRepeticao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = sc.nextInt();
        int soma = 0;

        for (int i = 0; i <= limite ; i++) {
            if (i % 3 == 0){
                if (i % 2 == 1) {
                    soma = soma + i;
                    System.out.println(soma);
                }
            }
        }
        sc.close();
    }
}
