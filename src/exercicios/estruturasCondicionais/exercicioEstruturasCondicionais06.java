package exercicios.estruturasCondicionais;

import java.util.Objects;
import java.util.Scanner;

public class exercicioEstruturasCondicionais06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        sc.nextLine();
        String sexo = sc.nextLine();

        boolean isIdade = idade >= 18;
        boolean isSexo = sexo.equalsIgnoreCase("Masculino");

        if (isIdade && isSexo){
            System.out.println(isIdade);
            System.out.println(isSexo);
        }
        else{
            System.out.println(isIdade);
            System.out.println(isSexo);
        }


        sc.close();
    }
}
