/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_interfaces;

/**
 *
 * @author ricar
 */
public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MostrarDatos datos = new MostrarDatos();
        Persona perso = new Persona("Juan Perez", 50);
        perso.imprimirDatos();
        Computadora compu = new Computadora("intel i7", 12, 25000, "Computadora");
        compu.imprimirDatos();
    }
    
}
