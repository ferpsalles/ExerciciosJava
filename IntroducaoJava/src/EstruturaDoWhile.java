import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char verificar;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = ((9.0 * celsius) / 5.0) + 32.0;
            System.out.printf("O equivalente em Fahrenheit é %.1f%n", fahrenheit);
            System.out.println("Deseja verificar nova temperatura (s/n): ");
            verificar = sc.next().charAt(0);
        } while (verificar != 'n');
        sc.close();
    }
}