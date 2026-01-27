package estudo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado um valor de um , descubra em quantas ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        float valorDoCarro = 30000;

        for (int i = (int) valorDoCarro; i >= 1; i--) {
            float valorParcela = valorDoCarro / i;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Você pode parcelar em = "+i);
        }
    }
}
