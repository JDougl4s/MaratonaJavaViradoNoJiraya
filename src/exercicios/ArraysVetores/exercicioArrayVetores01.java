package exercicios.ArraysVetores;

import java.util.Scanner;

public class exercicioArrayVetores01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int i;
        for (i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A: "+ vetorA[0]);
        for ( i = 1; i < vetorA.length; i++) {
            System.out.print(" "+vetorA[i]);
        }

        System.out.println();
        System.out.print("Vetor B: "+ vetorB[0]);
        for ( i = 1; i < vetorA.length; i++) {
            System.out.print(" "+vetorB[i]);
        }

        sc.close();
    }
}
