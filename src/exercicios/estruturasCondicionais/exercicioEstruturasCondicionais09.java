package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura (em M):");
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe seu sexo (Masculino/Feminino):");
        String sexo = sc.nextLine();
        double pesoIdeal;

        if (sexo.equalsIgnoreCase("Masculino")){
            pesoIdeal = (72.7 * altura) - 58;
        }
        else{
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        System.out.printf("Seu peso ideal: %.2f Kg",pesoIdeal);

        sc.close();
    }
}
