/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_collections;

import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class EVA2_24_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //COLLECTIONS --> CONTENEDORES
        ArrayList miArreglo = new ArrayList();//Guardamos objetos en grupos
        miArreglo.add(new Persona());
        miArreglo.add(new Automovil());
        
        ArrayList<Persona> miArreglo2 = new ArrayList<Integer>();
        miArreglo2.add(100);
        miArreglo2.add(200);
        miArreglo2.add(300);
        miArreglo2.add(400);
        System.out.println(miArreglo2);
    }
    class Persona{
        
    }
    class Automovil{
        
    }
}
