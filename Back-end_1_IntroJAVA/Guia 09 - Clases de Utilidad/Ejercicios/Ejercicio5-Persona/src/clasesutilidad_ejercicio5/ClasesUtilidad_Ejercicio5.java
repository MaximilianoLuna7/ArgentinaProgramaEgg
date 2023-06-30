package clasesutilidad_ejercicio5;

import clasesutilidad_ejercicio5.entidades.Persona;
import clasesutilidad_ejercicio5.servicios.PersonaServicio;

public class ClasesUtilidad_Ejercicio5 {
//    Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
//    constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con
//    los siguientes métodos:
//    Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
//    Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
//    Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada
//    o false en caso contrario.
//    Método mostrarPersona que muestra la información de la persona deseada.

    public static void main(String[] args) {
        PersonaServicio pServicio = new PersonaServicio();
        
        Persona persona1 = pServicio.crearPersona();
        pServicio.dejarDeLeer();
        
        int edad = pServicio.calcularEdad(persona1);
        System.out.println("La persona tiene " + edad + " años.");
        System.out.println("-----------------");
        int edadAComparar = 20;
        if (pServicio.menorQue(persona1, edadAComparar)) {
            System.out.println("La persona tiene menos de " + edadAComparar + " años");
        } else {
            System.out.println("La persona tiene más de " + edadAComparar + " años");
        }
        System.out.println("-----------------");
        pServicio.mostrarPersona(persona1);
    }
    
}
