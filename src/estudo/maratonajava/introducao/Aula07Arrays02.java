package estudo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // byte, short, int, long, float e double 0
        // char "u\0000" " "
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Sasuke";
        nomes[2] = "Sakura";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}
