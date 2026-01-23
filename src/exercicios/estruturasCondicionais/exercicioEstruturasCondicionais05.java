package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero negativo ou positivo:");
        int numero = sc.nextInt();

        if (numero < 0){
            numero = numero * 3;
            System.out.println("Resultado: "+numero);
        } else if (numero > 0 ) {
            numero = numero * 2;
            System.out.println("Resultado: "+numero);
        }else{
            System.out.println("Seu valor é "+numero);
        }

        sc.close();
    }
}
