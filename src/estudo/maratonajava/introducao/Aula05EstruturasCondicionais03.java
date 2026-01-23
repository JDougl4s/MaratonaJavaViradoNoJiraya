package estudo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 3000;
        /*
         Operado ternario
         (condicao) ? verdadeiro ; falso
         Quando existir situacao de IF e Else
        */

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDouglas" : "Ainda não tenho condições, mas vou ter!!!";
        System.out.println(resultado);
    }
}
