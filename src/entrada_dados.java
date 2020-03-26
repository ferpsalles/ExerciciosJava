import java.util.Scanner;
import java.util.Locale;

public class entrada_dados {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.println("Insira comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.println("Insira valor do m² do terreno: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Área do terreno: %.2f%n", area);
        System.out.printf("Preço do terreno: %.2f%n", preco);

        sc.close();

    }

}