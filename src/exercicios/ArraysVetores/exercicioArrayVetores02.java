package exercicios.ArraysVetores;

import java.util.Scanner;

public class exercicioArrayVetores02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetorA = new int[5];
        int [] vetorB = new int[5];
        int [] vetorC = new int[5];
        int i;

        System.out.println("Digite 5 valores:");
        for ( i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite 5 valores:");
        for ( i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
            vetorC[i] = vetorA[i] + vetorB[i];
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

        System.out.println();
        System.out.print("Vetor C: "+ vetorC[0]);
        for ( i = 1; i < vetorA.length; i++) {
            System.out.print(" "+vetorC[i]);
        }

        sc.close();
    }
}
