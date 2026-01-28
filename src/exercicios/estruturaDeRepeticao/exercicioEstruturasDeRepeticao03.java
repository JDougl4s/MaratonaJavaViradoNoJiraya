package exercicios.estruturaDeRepeticao;

import java.util.Scanner;

public class exercicioEstruturasDeRepeticao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quanto números você ira inserir:");
        int limite = sc.nextInt();
        double soma = 0;
        int contPositivos = 0;
        int contNegativos = 0;

        for (int i = 0; i < limite; i++) {
            double numeros = sc.nextInt();
            soma = soma + numeros;

            if (numeros > 0){
                contPositivos++;
            }
            else{
                contNegativos++;
            }
        }

        double mediaAritmetica = soma / limite;
        double percentualPositivo = ((double) contPositivos / limite ) *100;
        double percentualNegativo = ((double) contNegativos / limite ) *100;

        System.out.printf("Média Aritmética: %.2f\n",mediaAritmetica);
        System.out.println("Quantidade de positivos: "+ contPositivos);
        System.out.println("Quantidade de negativos: "+ contNegativos);
        System.out.printf("Percentual positivo: %.2f%%\n", percentualPositivo);
        System.out.printf("Percentual negativo: %.2f%%\n", percentualNegativo);

        sc.close();
    }
}
