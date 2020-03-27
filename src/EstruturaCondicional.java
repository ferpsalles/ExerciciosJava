//Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
//dá direito a 100 minutos de telefone. Cada minuto que exceder a
//franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
//quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago

import java.util.Locale;
import java.util.Scanner;


public class EstruturaCondicional {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe os minutos do telefone: ");
        int minutos = sc.nextInt();

        if (minutos<=100) {
             System.out.print("Você não excedeu a franquia. Pagar R$50,00.");
            }
        else {
            double minutos_excendentes = ((minutos -100) * 2) +50;
                    System.out.println ("Você excendeu a franquia.");
                    System.out.println("Você deve pagar: R$" + minutos_excendentes);
             }
        sc.close();
        }
    }




