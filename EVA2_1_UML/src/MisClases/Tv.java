/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author ricar
 */
public class Tv {
    private int canal;
    private int volumen;
    private boolean power;
    
    public int getCanal(){
        return canal;
    }
    public void setCanal(int valor){
        canal = valor;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int valor){
        volumen = valor;
    }
    public boolean getPower(){
        return power;
    }
    public void setPower(boolean valor){
        power = valor;
    }
    public void imprimirDatos(){
        System.out.println("El estado de la Tv es: ");
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("Power: " + power);
    }
}
