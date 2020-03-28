import java.util.Scanner;
public class EstruturaFor {
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Informe o valor de número para a soma: ");
        int N =sc.nextInt();
        int soma=0;

        for (int i=0;i<N;i++){
            System.out.print("Informe o número:");
            int x=sc.nextInt();
            soma= soma +x;
        }
        System.out.printf("A soma dos valores foi: %d",soma);
        sc.close();
    }
}
