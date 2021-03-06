package Logica;


public class Circulo extends FiguraGeometrica {
    double radio;
    double diametro;
    
    
     public void calcularArea(double rad){
        radio = rad;
        this.setArea( 3.14*radio*radio);   
       
     }
     
    public void calcularPerimetro(double radio){
        double perim;
        double pi = 3.14;
        perim = 2 * pi * radio;
        this.setPerimetro(perim);
    } 
    
    
    public Circulo(double radio, double diametro, int cantidadLados, String nombre, double area, double perimetro) {
        super(cantidadLados, nombre, area, perimetro);
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    
}
