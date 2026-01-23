package estudo.maratonajava.introducao;

/*Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>.
*/

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        String nome = "Douglas";
        String endereco = "Rua Doutor Antonio Carneiro";
        double salario = 2500.0;
        String dataRecebimentoSalario = "24-06-2026";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+ ",\nconfirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario+".");
    }
}
