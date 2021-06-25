package Logica;

public class Controladora {
  
    //Area y perimetro del triangulo
    public double calcularAreaTriangulo(double lado1, double lado2, double lado3){
        Triangulo triangulo = new Triangulo();
    
        triangulo.calcularArea(lado1, lado2, lado3);
        return triangulo.getArea();
    }
    
    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3){
        Triangulo triangulo = new Triangulo();
        
        triangulo.calcularPerimetro(lado1, lado2, lado3);
        return triangulo.getPerimetro();
    }
    
    
    //area y perimetro del cuadrado
    public double calcularAreaCuadrado(double lado){
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.calcularArea(lado);
        
        return cuadrado.getArea();
    }
    
    
    
    //area y perimetro del circulo
    public double calcularAreaCirculo(double radio){
        Circulo circulo = new Circulo();
        
        circulo.calcularArea(radio);
        return circulo.getArea();
    }
}
