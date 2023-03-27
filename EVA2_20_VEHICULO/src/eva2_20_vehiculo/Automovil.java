/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author ricar
 */
public class Automovil extends Vehiculo {
    private String modelo;
    private String placas;
    private int año;

    public Automovil() {
        modelo = "";
        placas = "";
        año = 0;
    }

    public Automovil(String modelo, String placas, int año) {
        super();
        this.modelo = modelo;
        this.placas = placas;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public int imprimirVel() {
    }
    
}
