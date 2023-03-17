/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_override_figuras;

/**
 *
 * @author ricar
 */
public class Triangulo extends Figura{
    private double lado;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (lado * altura)/2;
    }
    @Override
    public double calcularPeri(){
        return lado * lado * lado;
    }
}
