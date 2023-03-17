/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author ricar
 */
        //Proveedores is-a (es-un) persona
public class Proveedores extends Persona {
    private String rfc;

    public Proveedores() {
        super();
        this.rfc = "------";
    }

    public Proveedores(String nombre, String apellido, int edad, String rfc) {
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }
    
    

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: " + rfc);
    }
}
