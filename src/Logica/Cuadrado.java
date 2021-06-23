
package Logica;

public class Cuadrado extends FiguraGeometrica{
    private int lado, ar;
    
    //@Override
    public void calcularArea(int lad){
        ar = lad*lad;
        this.setArea(ar); 
       
    }
    
     public void calcularPerimetro(int lad){
        int perim;
        perim = lad*4;
        this.setPerimetro(perim);
        System.out.println("El perímetro del cuadrado es " + this.getPerimetro());
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
