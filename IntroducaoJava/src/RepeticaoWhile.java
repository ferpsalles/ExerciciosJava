import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        System.out.print("Informe um número: ");
        int x = sc.nextInt();

        while (x != 0) {
            soma = soma + x;
        }
        System.out.printf("A soma dos valores foi: %d%n", soma);
    }
}