package estudo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
         // while, do while,for
        int cont = 0;
        while (cont < 10){
            System.out.println(++cont);
        }

        // executa pelo menos 1 vez
        cont = 0;
        do {
            System.out.println("dentro do do-while "+ ++cont);
        }while (cont < 10);
        // serve para "contar"
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("For "+i);
        }
    }
}
