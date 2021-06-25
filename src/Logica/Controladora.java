package Logica;

public class Controladora {
  
    public double calcularAreaTriangulo(double lado1, double lado2, double lado3){
        Triangulo triangulo = new Triangulo();
        
        
        triangulo.calcularArea(lado1, lado2, lado3);
        return triangulo.getArea();
    }
}
