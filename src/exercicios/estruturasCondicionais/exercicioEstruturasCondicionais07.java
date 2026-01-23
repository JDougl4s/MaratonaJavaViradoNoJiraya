package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            numero = numero + 5;
            System.out.println(numero);
        }
        else{
            numero = numero + 8;
            System.out.println(numero);
        }


        sc.close();
    }
}
