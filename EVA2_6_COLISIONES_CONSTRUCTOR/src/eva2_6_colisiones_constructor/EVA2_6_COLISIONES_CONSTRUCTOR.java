/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_colisiones_constructor;

/**
 *
 * @author ricar
 */
public class EVA2_6_COLISIONES_CONSTRUCTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ANIMAL:");
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        
        System.out.println("MAMIFERO:");
        Mamifero mamifero = new Mamifero();
    }
    
}
