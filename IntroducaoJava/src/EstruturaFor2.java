/*
Ler um valor N.Calcular e escrever seu respectivo fatorial.Fatorial de N=N*(N-1)*(N-2)*(N-3)*...*1.
        Lembrando que,por definição,fatorial de 0é 1.
*/

import java.util.Scanner;

public class EstruturaFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para descobrir o fatorial:");
        int numero = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.print(fatorial);
        sc.close();
    }
}
