package exercicios.estruturaDeRepeticao;

import java.util.Scanner;

public class exercicioEstruturasDeRepeticao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int contNumeroPares = 0; int contNumeroImpares = 0; int contGeral = -1;
        double mediaPares; double mediaImpares; double mediaGeral;
        int somaNumeroPares = 0; int somaNumeroImpares = 0;int somaNumeroGeral = 0;

        System.out.println("Digite números positivos ( 0 para encerrar leitura )");
        for ( ; ; ) {
            numero = sc.nextInt();
            contGeral++;
            somaNumeroGeral = somaNumeroGeral + numero;

            if (numero == 0){
                System.out.println("Leitura encerrada!!!");
                break;
            }
            else{
                if (numero % 2 == 0){
                    contNumeroPares++;
                    somaNumeroPares = somaNumeroPares + numero;
                }else{
                    contNumeroImpares++;
                    somaNumeroImpares = somaNumeroImpares + numero;
                }
            }
        }
        mediaGeral = (double) somaNumeroGeral / contGeral;
        mediaPares = (double) somaNumeroPares / contNumeroPares;
        mediaImpares = (double) somaNumeroImpares / contNumeroImpares;

        System.out.println("Quantidade de números lidos: "+contGeral);
        System.out.println("Quantidade de números pares lidos: "+contNumeroPares);
        System.out.println("Quantidade de números impares lidos: "+contNumeroImpares);

        System.out.printf("Media Geral: %.2f\n",mediaGeral);
        System.out.printf("Media Pares: %.2f\n",mediaPares);
        System.out.printf("Media Impares: %.2f\n",mediaImpares);




        sc.close();
    }
}
