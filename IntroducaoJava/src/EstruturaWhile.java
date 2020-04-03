/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma) */

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da coordenada x:");
        int x = sc.nextInt();
        System.out.println("Digite o valor da coordenada y:");
        int y = sc.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Os valores pertencem ao primeiro quadrante");
            } else if (x < 0 && y >= 0) {
                System.out.println("Os valores pertencem ao segundo quadrante");
            }
            if (x < 0 && y < 0) {
                System.out.println("Os valores pertencem ao terceiro quadrante");
            } else {
                System.out.println("Os valores pertencem ao quarto quadrante");
            }

        }
    }
}