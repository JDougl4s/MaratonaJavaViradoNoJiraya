package exercicios.ArraysVetores;

import java.util.Scanner;

public class exercicioArrayVetores03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tamanho dos vetores:");
        int n1 = sc.nextInt();
        int [] vetorA = new int[n1];
        int [] vetorB = new int[n1];
        int [] vetorC = new int[n1*2];

        System.out.println("Quais valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Quais valores do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            if (i < vetorC.length/2){
                vetorC[i] = vetorA[i];
            }
            else{
                vetorC[i] = vetorB[i - vetorC.length / 2];
            }
        }

        System.out.print("Vetor A: "+ vetorA[0]);
        for ( int i = 1; i < vetorA.length; i++) {
            System.out.print(" "+vetorA[i]);
        }

        System.out.println();
        System.out.print("Vetor B: "+ vetorB[0]);
        for ( int i = 1; i < vetorB.length; i++) {
            System.out.print(" "+vetorB[i]);
        }

        System.out.println();
        System.out.print("Vetor C: "+ vetorC[0]);
        for (int i = 1; i < vetorC.length; i++) {
            System.out.print(" "+vetorC[i]);
        }




        sc.close();
    }
}
