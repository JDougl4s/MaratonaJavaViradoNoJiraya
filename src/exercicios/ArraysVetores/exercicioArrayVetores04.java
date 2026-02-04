package exercicios.ArraysVetores;

import java.util.Scanner;

public class exercicioArrayVetores04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[20];
        System.out.println("Quais valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.print("Vetor A: " + vetorA[0]);
        for (int i = 1; i < vetorA.length; i++) {
            System.out.print(" " + vetorA[i]);
        }
        System.out.println();
        System.out.print("Vetor A:");
        for (int i = vetorA.length - 1; i >= 0; i--) {
            System.out.print(" " + vetorA[i]);
        }
        sc.close();
    }
}
