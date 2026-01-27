package estudo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado um valor de um , descubra em quantas ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        float valorDoCarro = 50000;
        float valorParcela= 1000;

        for (int i = 1; i <= valorDoCarro; i++) {
            if (valorDoCarro / i < 1000){
                break;
            }
            System.out.println("Você pode parcelar em = "+i);
        }
    }
}
