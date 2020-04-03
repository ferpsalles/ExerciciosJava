package exercicios;
import Caluladora.CalculoRetangulo;
import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalculoRetangulo x, y;
        x = new CalculoRetangulo();
        y = new CalculoRetangulo();

        System.out.print ("Digite a largura do Retângulo: ");
        x.largura = sc.nextDouble();
        System.out.print("Digite a altura do Retângulo: ");
        y.altura = sc.nextDouble();

        System.out.printf("ÁREA: %.2f%n", CalculoRetangulo.area());
        System.out.printf("PERÍMETRO: %.2f%n", CalculoRetangulo.perimetro());
        System.out.printf ("DIAGONAL: %.2f%n ", CalculoRetangulo.diagonal());

        sc.close();


    }
}
