package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os três valores:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A + B < C){
            System.out.println("A Soma de A + B é menor que C");
        }
        else if (A + B > C){
            System.out.println("A Soma de A + B é maior que C");
        }
        else{
            System.out.println("A Soma de A + B é igual a C");
        }

    }
}
