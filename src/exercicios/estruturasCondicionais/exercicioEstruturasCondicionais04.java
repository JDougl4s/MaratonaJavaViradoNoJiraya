package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois valores:");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A == B ){
            int C = A + B;
            System.out.println("Resultado: "+C);
        }
        else {
            int C = A * B;
            System.out.println("Resultado: "+C);
        }

        sc.close();
    }
}
