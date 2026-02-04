package exercicios.ArraysVetores;

import java.util.Scanner;

public class exercicioArrayVetores06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] vetor = new float[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextFloat();
        }
        float contMaior = vetor[0];
        float contMenor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] > contMaior) {
                    contMaior = vetor[i];
                }
            }
        System.out.println("Maior valor: " + contMaior);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < contMenor) {
                contMenor = vetor[i];
            }
        }
        System.out.println("Menor valor: " + contMenor);
        sc.close();
    }
}
