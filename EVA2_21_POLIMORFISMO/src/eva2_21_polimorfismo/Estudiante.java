/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_21_polimorfismo;

/**
 *
 * @author ricar
 */
        //Clase Derivada extends Clase Base
        //Subclase extends Superclase
        //Hijo extends Padre
        //Estudiante is-a persona
public class Estudiante extends Persona{
    private String noControl;
    
    //HAY QUE INCLUIR EL CONSTRUCTOR DEFAULT Y LA
    public Estudiante(){
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        this.noControl = "------";
    }

    public Estudiante(String nombre, String apellido, int edad, String noControl) {
        super(nombre, apellido, edad);//LLAMADA AL CONSTRUCTOR 
        this.noControl = noControl;
    }
    

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //OVERRIDE: REEMPLAZA EL MÉTODO (CON LA MISMA FIRMA) EN LA
    //SUPER CLASE, EN ESTE CASO, OCULTAMOS A imprimirDatos() de
    //Persona
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de control:" + noControl);
    }
}
