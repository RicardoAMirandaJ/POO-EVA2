/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_polimorfismo;

/**
 *
 * @author ricar
 */
public class EVA2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("Ricardo", "Miranda", 19, "0011");
        estu.imprimirDatos();
        Docentes docente = new Docentes();
        docente.setNombre("Martina7");
        docente.setApellido("Chavez");
        docente.setPlaza("Tiempo completo");
        docente.setEdad(22);
        docente.imprimirDatos();
        //PUEDO TRATAR A LOS OBJETOS DE LAS SUBCLASES
        //COMO OBJETOS DE LA SUPERCLASE
        //AL REVÉS NO SE PUEDE
        //ESTOY ASIGNANDO UN OBJETO DE TIPO ESTUDIANTE
        //A UNA VARIABLE DE TIPO PERSONA
        Persona perso = estu;
        //ESTOY GENERALIZANDO (SIMPLIFICANDO)
        Persona perso2 = docente;
        Persona perso3 = new Persona();
        //Es imposible convertir una persona en un estudiante
        //no podemos agregar cosas, simplemente ocultamos
        //propiedades
        Estudiante estudiante = perso3;
    }
    
}
