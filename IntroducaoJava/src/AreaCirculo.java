import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = 3.14159 * Math.sqrt(raio);
        System.out.println("A area do circulo:" + area);

        sc.close();

    }
}