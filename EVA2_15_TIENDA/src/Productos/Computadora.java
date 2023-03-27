/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Electronica;

/**
 *
 * @author ricar
 */
public final class Computadora extends Electronica {
    private double tamaño;
    private int memoria;
    private String procesador;
    private String discoDuro;

    public Computadora() {
        super();
        this.tamaño = 0;
        this.memoria = 0;
        this.procesador = "";
        this.discoDuro = "";
    }

    public Computadora(double tamaño, int memoria, String procesador, String discoDuro, String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantia, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.discoDuro = discoDuro;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    @Override
    public double precioVenta(int cant){
        //10 unidades --> el precio es del 80%
        if(cant < 10)
            return precio * cant;
        else 
            return (precio * 0.8) * cant;
    }
    
}

//Computadora es una clase final;
//ya no se puede heredar de una clase final
/* class Laptop extends Computadora{
    
} */
