package exercicios.estruturaDeRepeticao;

import java.util.Scanner;

public class exercicioEstruturasDeRepeticao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorInicial = sc.nextInt();
        int fatorial = 1;
        for (int i = valorInicial; i >= 1 ; i--) {
            fatorial = fatorial * i;
            if (i > 1) {
                System.out.print(i + " x ");
            }
            else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + fatorial);
        }
    }


