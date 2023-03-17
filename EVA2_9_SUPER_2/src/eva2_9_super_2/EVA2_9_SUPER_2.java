/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author ricar
 */
public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante = new Estudiante("Ricardo Alberto", "Miranda Jimenez", 18, "22550339");
        estudiante.imprimirDatos();
        
        Proveedores proveedor = new Proveedores("Jesus Ivan", "Vargas Marquez", 18, "JIVM010704");
        proveedor.imprimirDatos();
        
        Docentes docente = new Docentes("Axel Jasiel", "Hernandez Prieto", 18, "jfhdshopa");
        docente.imprimirDatos();
    }
    
}
