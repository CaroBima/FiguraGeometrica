package Logica;


public class FiguraGeometrica {
    private int cantidadLados;
    private String nombre;
    private double area;
    private double perimetro;
    
    
    public void calcularArea(){
    }
    
    public void calcularPerimetro(){
    }

    public FiguraGeometrica(int cantidadLados, String nombre, double area, double perimetro) {
        this.cantidadLados = cantidadLados;
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    }

    public FiguraGeometrica() {
    }

    public int getCantidadLados() {
        return cantidadLados;
    }

    public void setCantidadLados(int cantidadLados) {
        this.cantidadLados = cantidadLados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
}
