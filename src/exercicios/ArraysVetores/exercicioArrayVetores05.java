package exercicios.ArraysVetores;

public class exercicioArrayVetores05 {
    public static void main(String[] args) {

        int [] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int [] vetorB = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Tabuada do "+vetorA[i]);
            for (int j = 0; j < vetorB.length; j++) {
                int multiplicao = vetorA[i] * vetorB[j];
                System.out.println(vetorA[i]+" x "+vetorB[j]+" = "+multiplicao);

            }
            System.out.println();
        }
    }
}
