package exercicios;

import java.util.Scanner;

public class exercicioEstruturasSequencias01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseRetangulo = sc.nextDouble();
        double alturaetangulo = sc.nextDouble();
        double areaRetangulo = baseRetangulo * alturaetangulo;
        System.out.println(areaRetangulo);

        sc.close();
    }
}
