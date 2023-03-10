/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_super;

/**
 *
 * @author ricar
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal("sdfasd",10);
        Mamifero mamifero = new Mamifero("negro", "asdfasd",10);
        Canes can = new Canes();
    }
}

class Animal{
    private String nombre;
    private int peso;
    
    public Animal(){
        System.out.println("IST ALIVE!!");
    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("ITS ALIVE constructor 2!!");
    }
    
    public void respirar(){
        System.out.println("Estoy respirando");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
class Mamifero extends Animal{
    private String colorPelo;
    
    public Mamifero(){
        //super --> apuntador a la superclase
        //lo primero a llamar en un constructor es llamar
        //al constructor de la superclase
        super();//llamada al constructor default
        System.out.println("soy un mamifero!!");
    }


    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);//llamada al constructor de la super clase
        this.colorPelo = colorPelo;
        System.out.println("soy un mamifero constructor 2!!");
    }
    
    

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
}
class Canes extends Mamifero{
    
    public Canes(){
        super();
        System.out.println("Soy un can!!");
    }
}
