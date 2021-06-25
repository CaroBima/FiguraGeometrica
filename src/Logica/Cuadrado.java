package Logica;

public class Cuadrado extends FiguraGeometrica {

    private double lado, ar;

    //@Override
    public void calcularArea(double lad) {
        ar = lad * lad;
        this.setArea(ar);

    }

    public void calcularPerimetro(double lado) {
        double perim;
        perim = lado * 4;
        this.setPerimetro(perim);
    }

    public Cuadrado() {
    }

    public Cuadrado(double lado, double ar, int cantidadLados, String nombre, double area, double perimetro) {
        super(cantidadLados, nombre, area, perimetro);
        this.lado = lado;
        this.ar = ar;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

}
