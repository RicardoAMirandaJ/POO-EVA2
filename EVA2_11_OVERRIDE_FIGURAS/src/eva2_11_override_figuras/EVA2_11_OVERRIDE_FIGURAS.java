/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_override_figuras;

/**
 *
 * @author ricar
 */
public class EVA2_11_OVERRIDE_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circu = new Circulo(10);
        System.out.println("Area: " + circu.calcularArea());
        System.out.println("Perimetro: " + circu.calcularPeri());
    }
    
}
