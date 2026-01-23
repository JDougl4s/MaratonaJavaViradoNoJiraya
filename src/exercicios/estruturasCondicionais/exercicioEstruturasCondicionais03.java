package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número qualquer:");
        int numero= sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Seu número é par");
        }
        else{
            System.out.println("Seu número é impar");
        }

        sc.close();
    }
}
