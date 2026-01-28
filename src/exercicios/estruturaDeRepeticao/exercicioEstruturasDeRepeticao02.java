package exercicios.estruturaDeRepeticao;

import java.util.Scanner;

public class exercicioEstruturasDeRepeticao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maiorAltura = 0;
        double menorAltura = 0;

        for (int i = 1; i <= 2; i++) {
            double alturas = sc.nextDouble();

            if (i == 1){
                maiorAltura = alturas;
                menorAltura = alturas;
            }else{
                if (alturas > maiorAltura){
                    maiorAltura = alturas;
                }
                if (alturas < menorAltura){
                    menorAltura = alturas;
                }
            }
        }
        System.out.printf("Maior altura: %.2f\n",maiorAltura);
        System.out.printf("Menor altura: %.2f",menorAltura);
    }
}
