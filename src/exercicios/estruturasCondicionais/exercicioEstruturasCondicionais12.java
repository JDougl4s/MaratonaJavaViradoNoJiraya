package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu numero de identificação:");
        int numeroIdentificacao = sc.nextInt();
        System.out.println("Informe as suas três notas:");
        double nota1 = sc.nextDouble();
        double nota2= sc.nextDouble();
        double nota3 = sc.nextDouble();

        double mediaExercicios = (nota1 + nota2 + nota3) / 3;
        double mediaAproveitamento = ((nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7)*10;

        System.out.println("Dados:");
        System.out.println("Id: "+numeroIdentificacao);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Nota 3: "+nota3);
        System.out.printf("Média dos exercicios: %.2f\n",mediaExercicios);
        System.out.println("Média de aproveitamento: "+(int) mediaAproveitamento);

        if (mediaAproveitamento < 40){
            System.out.println("Conceito: E");
            System.out.println("Você foi REPROVADO");
        }
        else if (mediaAproveitamento < 60) {
            System.out.println("Conceito: D");
            System.out.println("Você foi REPROVADO");
        }
        else if (mediaAproveitamento < 75) {
            System.out.println("Conceito: C");
            System.out.println("Você foi APROVADO");
        }
        else if (mediaAproveitamento < 90) {
            System.out.println("Conceito: B");
            System.out.println("Você foi APROVADO");
        }
        else{
            System.out.println("Conceito: A");
            System.out.println("Você foi APROVADO");
        }
        sc.close();
    }
}
