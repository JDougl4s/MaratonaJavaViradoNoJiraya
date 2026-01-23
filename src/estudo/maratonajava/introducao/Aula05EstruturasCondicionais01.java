package estudo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebiba");
        }else{
            System.out.println("Não Autorizado a comprar bebiba");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebiba");
        }

        boolean c = true;
        if (c = false){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
