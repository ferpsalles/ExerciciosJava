package Caluladora;

public class CalculoRetangulo {
    public static double largura;
    public static double altura;
    public static double area;
    public static double perimetro;
    public static double diagonal;

    public static double area(){
        return area = (altura * largura);
    }

    public static double perimetro(){
        return perimetro = 2*(largura+altura);
        }

    public static double diagonal(){
        return diagonal = Math.sqrt((altura*altura) + (largura*largura));
    }


}

