/*
Práctica de POO, sirve para calcular el area y perimetro de diferentes figuras geométricas
se asume que el usuario va a ingresar solo numeros
 */
package Logica;

import IGU.FrmPrincipal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        FrmPrincipal formulario = new FrmPrincipal();
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null); //
        
        /*Comentado toda la logica que se ejecuta por consola para poder hacerlo por el form
        
        variables usadas en la ejecucion por consola
        int tipoFigura = 9;
        int lado = 0;
        double radio = 02;
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        int areaOPerimetro = 0;
        
        
        //valido que se ingrese una opcion valida
        while (tipoFigura != 0 && (tipoFigura != 1 && tipoFigura != 2 && tipoFigura != 3)) {
            System.out.println("Seleccione figura geométrica: ");
            System.out.println("1. Cuadrado. ");
            System.out.println("2. Círculo. ");
            System.out.println("3. Tríangulo. ");
            System.out.print("Valor ingresado: ");
            Scanner opcion = new Scanner(System.in);
            tipoFigura = opcion.nextInt();
            if(tipoFigura != 0 && (tipoFigura != 1 && tipoFigura != 2 && tipoFigura != 3)){
                
                System.out.println("El valor ingresado debe ser 1, 2 o 3 \n");
            }
        }

        //ingreso de valores por teclado
        if (tipoFigura == 1) {
            //opcion 1. Cuadrado
            System.out.print("Ingrese el valor del lado: ");
            Scanner ladoc = new Scanner(System.in);
            lado = ladoc.nextInt();
        } else 
            if (tipoFigura == 2) {
            //opcion 2. circulo
                System.out.print("Ingrese el valor del radio: ");
                Scanner radioc = new Scanner(System.in);
                radio = radioc.nextDouble();
            } else 
                if (tipoFigura == 3) {
                //opcion 3. triangulo
                    System.out.print("Ingrese lado 1: ");
                    Scanner lado1Teclado = new Scanner(System.in);
                    lado1 = lado1Teclado.nextInt();
                    System.out.print("Ingrese lado 2: ");
                    Scanner lado2Teclado = new Scanner(System.in);
                    lado2 = lado2Teclado.nextInt();
                    System.out.print("Ingrese lado 3: ");
                    Scanner lado3Teclado = new Scanner(System.in);
                    lado3 = lado3Teclado.nextInt();
                    while (lado1 == 0 || lado2 == 0 || lado3 == 0) {
                        System.out.println("Los lados deben ser mayores a cero. ");
                        if (lado1 == 0) {
                            System.out.print("Ingrese nuevamente el lado 1: ");
                            Scanner ladoMalo1 = new Scanner(System.in);
                            lado1 = ladoMalo1.nextInt();
                        } else 
                            if (lado2 == 0) {
                                System.out.print("Ingrese nuevamente el lado 1: ");
                                Scanner ladoMalo2 = new Scanner(System.in);
                                lado3 = ladoMalo2.nextInt();
                                } 
                            else {
                                System.out.print("Ingrese nuevamente el lado 1: ");
                                Scanner ladoMalo3 = new Scanner(System.in);
                                lado3 = ladoMalo3.nextInt();
                              }
                    }
                } 

        //pregunto que desea calcular y valido que se ingrese 1 o 2
        while (areaOPerimetro != 1 && areaOPerimetro != 2) {
            System.out.println(" ");
            System.out.println("¿Qué desea calcular?");
            System.out.println("1. Area");
            System.out.println("2. Perímetro");
            System.out.print("Ingrese número de opción: ");
            Scanner areoper = new Scanner(System.in);
            areaOPerimetro = areoper.nextInt();
            if (areaOPerimetro !=1 && areaOPerimetro != 2){
                System.out.println("El valor ingresado debe ser 1 o 2");
            }
        }
        
        if(areaOPerimetro == 1){
            switch(tipoFigura){
                case 1 -> {
                    Cuadrado cuadrado = new Cuadrado();
                    cuadrado.calcularArea(lado);
                    System.out.println("El área del cuadrado es " + cuadrado.getArea() );
                }
                case 2 -> {
                    Circulo circulo = new Circulo();
                    circulo.calcularArea(radio);
                    System.out.println("El área del círculo es " + circulo.getArea() );
                }
                case 3 -> {
                    Triangulo triangulo = new Triangulo();
                    triangulo.calcularArea(lado1, lado2, lado3);
                    System.out.println("Área del triangulo: " + triangulo.getArea());
                }
            }
        } else{
            switch(tipoFigura){
                case 1 -> {
                    Cuadrado cuadrado = new Cuadrado();
                    cuadrado.calcularPerimetro(lado);
                    System.out.println("El perímetro del cuadrado es " + cuadrado.getPerimetro() );
                }
                case 2 -> {
                    Circulo circulo = new Circulo();
                    circulo.calcularPerimetro(radio);
                    System.out.println("El perímetro del círculo es " + circulo.getPerimetro() );
                }
                case 3 -> {
                    Triangulo triangulo = new Triangulo();
                    triangulo.calcularPerimetro(lado1, lado2, lado3);
                    System.out.println("El perímetro del triangulo es " + triangulo.getPerimetro());
                }
            }
        
        }   
            
         */
    } // main

}
