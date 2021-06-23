package Logica;


public class Triangulo extends FiguraGeometrica{
    private double lado1;
    private double lado2;
    private double lado3;
    private double angulo1;
    private double angulo2;
    private double angulo3;
    private double area = 0;
    private double semiperimetro = 0;
    private double raiz = 0;
    

    //calcula el area del triangulo segun los lados ingresados por el usuario
    public void calcularArea(double lado1, double lado2, double lado3){
        semiperimetro = (lado1 + lado2 + lado3)/2;
        raiz = semiperimetro*((semiperimetro - lado1)*(semiperimetro - lado2)*(semiperimetro - lado3));
        area = Math.sqrt(raiz);
        this.setArea(area);
    }
    
    public Triangulo(int lado1, int lado2, int lado3, double angulo1, double angulo2, double angulo3, int cantidadLados, String nombre, double area, double perimetro) {
        super(cantidadLados, nombre, area, perimetro);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
        this.angulo3 = angulo3;
    }

    public Triangulo() {
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public double getAngulo1() {
        return angulo1;
    }

    public void setAngulo1(double angulo1) {
        this.angulo1 = angulo1;
    }

    public double getAngulo2() {
        return angulo2;
    }

    public void setAngulo2(double angulo2) {
        this.angulo2 = angulo2;
    }

    public double getAngulo3() {
        return angulo3;
    }

    public void setAngulo3(double angulo3) {
        this.angulo3 = angulo3;
    }
    
    
    
}
