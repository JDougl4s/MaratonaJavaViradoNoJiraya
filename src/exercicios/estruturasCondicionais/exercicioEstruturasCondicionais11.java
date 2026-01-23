package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de etiqueta:");
        double valorDeEtiqueta = sc.nextDouble();
        System.out.println("Selecione as condições de pagamento:\n"+
                "1 À vista em dinheiro ou cheque, recebe 10% de desconto\n"+
                "2 À vista no cartão de crédito, recebe 15% de desconto\n"+
                "3 Em duas vezes, preço normal de etiqueta sem juros\n"+
                "4 Em duas vezes, preço normal de etiqueta mais juros de 10%");
        int condicao = sc.nextInt();
        double precoFinal;

        if (condicao == 1){
            precoFinal = valorDeEtiqueta * 0.1;
            precoFinal = valorDeEtiqueta - precoFinal;
            System.out.printf("Preço final: R$ %.2f", precoFinal);
        }
        else if (condicao == 2) {
            precoFinal = valorDeEtiqueta * 0.15;
            precoFinal = valorDeEtiqueta - precoFinal;
            System.out.printf("Preço final: R$ %.2f", precoFinal);
        }
        else if (condicao ==3) {
            System.out.printf("Preço normal de etiqueta: R$ %.2f", valorDeEtiqueta);
        }
        else if (condicao == 4) {
            precoFinal = valorDeEtiqueta * 0.1;
            precoFinal = valorDeEtiqueta + precoFinal;
            System.out.printf("Preço final: R$ %.2f", precoFinal);
        }
        else{
            System.out.println("Não exite essa opção!");
        }
        sc.close();
    }
}
