
package Logica;

public class Cuadrado extends FiguraGeometrica{
    private int lado, ar;
    
    //@Override
    public void calcularArea(int lad){
        ar = lad*lad;
        this.setArea(ar); 
       
    }
    
     public void calcularPerimetro(int lado){
        int perim;
        perim = lado*4;
        this.setPerimetro(perim);
    }

    public Cuadrado() {
    }

    public Cuadrado(int lado, int ar, int cantidadLados, String nombre, double area, double perimetro) {
        super(cantidadLados, nombre, area, perimetro);
        this.lado = lado;
        this.ar = ar;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getArea() {
        return ar;
    }

    public void setArea(int area) {
        this.ar = ar;
    }
     
     
}
