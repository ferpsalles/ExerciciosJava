package entities;

// nome da classe
public class Triangle {

    // atributos da classe
    public double a;
    public double b;
    public double c;

    // metodo da classe
    public double area() {
        double p = (a + b + c)/2.0;
        return Math.sqrt(p * (p-a)* (p-b)* (p-c));
    }

}
