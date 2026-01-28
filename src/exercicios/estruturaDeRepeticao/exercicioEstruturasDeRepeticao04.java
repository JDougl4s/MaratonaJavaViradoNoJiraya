package exercicios.estruturaDeRepeticao;

import java.util.Scanner;

public class exercicioEstruturasDeRepeticao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qunatidade de números que você irá inserir:");
        int limite = sc.nextInt();
        int cont01 = 0;
        int cont02 = 0;
        int cont03 = 0;
        int cont04 = 0;

        for (int i = 0; i < limite; i++) {
            int numero = sc.nextInt();
            if (numero < 0){
                System.out.println("Número negativo");
                break;
            }else {
                if (numero > 0 && numero <=25){
                    cont01++;
                }
                else if (numero > 25 && numero <= 50) {
                    cont02++;
                }
                else if (numero > 50 && numero <= 75) {
                    cont03++;
                }
                else if (numero > 75 && numero <= 100) {
                    cont04++;
                }
            }
        }
        System.out.println("Existem "+cont01+" números no intervalo [0-25]");
        System.out.println("Existem "+cont02+" números no intervalo [26-50]");
        System.out.println("Existem "+cont03+" números no intervalo [51-75]");
        System.out.println("Existem "+cont04+" números no intervalo [76-100]");

        sc.close();
    }
}
