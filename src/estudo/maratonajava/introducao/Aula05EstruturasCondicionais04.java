package estudo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu sálario anual?");
        double salario = sc.nextDouble();
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        String resultado;
        double valorImposto;

        if (salario <= 34712){
            resultado = "Você irá pagar 9,70% de impostos";
            valorImposto = salario * primeiraFaixa;
        }
        else if (salario > 34712 && salario <= 68507){
            resultado = "Você irá pagar 37,35% de impostos";
            valorImposto = salario * segundaFaixa;
        }
        else{
            resultado = "Você irá pagar 49,50% de impostos";
            valorImposto = salario * terceiraFaixa;
        }
        System.out.println(resultado);
        System.out.println(valorImposto);

        sc.close();
    }
}
