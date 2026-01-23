package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso em KG:");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura em M:");
        double altura = sc.nextDouble();
        double imc = peso / (Math.pow(altura,2));

        if (imc < 18.5){
            System.out.println("Você está abaixo do peso");
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está com o peso normal");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("Você está acima do peso");
        }
        else{
            System.out.println("Você está obeso");
        }
        sc.close();
    }
}
