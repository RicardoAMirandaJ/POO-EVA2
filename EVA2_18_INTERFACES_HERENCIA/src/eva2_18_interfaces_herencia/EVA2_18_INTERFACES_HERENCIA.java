/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_interfaces_herencia;

/**
 *
 * @author ricar
 */
public class EVA2_18_INTERFACES_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface intA{
    public abstract void A();
}

interface intB{
    void B();//implícitamente está incluído public abstract
}

interface intC extends intA, intB{
    public abstract void C();
}

class Prueba implements intC{

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {
    }
    
}