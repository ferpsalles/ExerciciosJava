/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível. */

import java.util.Scanner;

public class EstruturaWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tipo de combustível: ");
        int combustivel = sc.nextInt();
        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;
        while (combustivel != 4) {
            System.out.print("Informe o tipo de combustível: ");

            if (combustivel == 1) {
                alcool = alcool + 1;
            } else if (combustivel == 2) {
                gasolina = gasolina + 1;
            } else if (combustivel == 3) {
                diesel = diesel + 1;
            }
            combustivel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADA");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina:" + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();

    }
}
