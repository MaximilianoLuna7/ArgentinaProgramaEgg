package excepciones_ejercicio1;

import excepciones_ejercicio1.entidades.Persona;

/**
 * @author Maximiliano Luna
 */
public class Excepciones_Ejercicio1 {
//    Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
//    de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
//    con una cláusula try-catch para probar la nueva excepción que debe ser controlada.

    public static void main(String[] args) {
        Persona persona = null;
        
        try {
            boolean esMayor = persona.esMayorDeEdad();
            System.out.println(esMayor ? "Es mayor de edad" : "Es menor de edad");
        } catch (Exception e) {
            System.out.println("Error: el objeto persona es null");
        }
    }

}
