/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eva2_22_polimorfismo_figuras;

/**
 *
 * @author ricar
 */
public interface Figuras {
    //No se pueden instanciar las interfaces
    //son como un contrato: estoy obligado a implementar
    //solo métodos abstractos y constantes
    public abstract double calcularArea();
    double calcularPeri();
}
