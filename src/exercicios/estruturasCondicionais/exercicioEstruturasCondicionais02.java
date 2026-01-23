package exercicios.estruturasCondicionais;

import java.util.Scanner;

public class exercicioEstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seus dados:");
        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Estado Civil (Solteiro(a)/Casado(a)/Viuvo(a)):");
        String estadoCivil = sc.nextLine();

        System.out.println("Sexo (F/M):");
        char sexo = sc.nextLine().charAt(0);
        int tempoDeCasada;

        if (estadoCivil.equals("Casada")&& sexo == 'F'){
            System.out.println("Informe quanto tempo de casada:");
            tempoDeCasada = sc.nextInt();
            System.out.println("Dados registrado:\nNome: "+nome+"\nSexo: "+sexo+"\nEstado Civil: "+estadoCivil+ "\nVocê estar casada há: "+tempoDeCasada+" anos");
        }
        else {
            System.out.println("Dados registrado:\n Nome: "+nome+"\nSexo: "+sexo+"\nEstado Civil: "+estadoCivil);
        }

        sc.close();
    }
}
