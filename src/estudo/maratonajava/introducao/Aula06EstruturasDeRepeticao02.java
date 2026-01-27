package estudo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números de 0 até 1000000

        int limite = 100;

        for (int i = 0 ; i < limite ; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
