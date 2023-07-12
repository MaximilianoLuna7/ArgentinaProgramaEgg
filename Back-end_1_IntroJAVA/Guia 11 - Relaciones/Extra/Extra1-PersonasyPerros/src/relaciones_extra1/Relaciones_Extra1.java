package relaciones_extra1;

import java.util.ArrayList;
import relaciones_extra1.entidades.Perro;
import relaciones_extra1.entidades.Persona;
import relaciones_extra1.servicios.Servicio;

/**
 * @author Maximiliano Luna
 */
public class Relaciones_Extra1 {
//    Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//    tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//    cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//    al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//    persona.
//    Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//    personas con sus respectivos perros.
    
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();
        
        Persona persona1 = new Persona("Ana", "García", 25, 1234567890L);
        Persona persona2 = new Persona("Juan", "Martínez", 32, 9876543210L);
        Persona persona3 = new Persona("Maria", "López", 42, 5678901234L);
        Persona persona4 = new Persona("Carlos", "Rodríguez", 37, 2345678901L);
        Persona persona5 = new Persona("Laura", "Pérez", 29, 9012345678L);
        Persona persona6 = new Persona("Pedro", "Gómez", 38, 3456789012L);
        Persona persona7 = new Persona("Sofia", "Fernández", 51, 6789012345L);
        Persona persona8 = new Persona("Miguel", "Torres", 44, 4321098765L);
        Persona persona9 = new Persona("Carmen", "Ramírez", 33, 8901234567L);
        Persona persona10 = new Persona("Luis", "Hernández", 27, 5432109876L);
        
        Perro perro1 = new Perro("Max", "Labrador Retriever", 3, 60);
        Perro perro2 = new Perro("Luna", "Bulldog Francés", 5, 35);
        Perro perro3 = new Perro("Rocky", "Golden Retriever", 2, 55);
        Perro perro4 = new Perro("Bella", "Poodle", 4, 40);
        Perro perro5 = new Perro("Toby", "Chihuahua", 1, 20);
        Perro perro6 = new Perro("Simba", "Husky Siberiano", 4, 65);
        Perro perro7 = new Perro("Lola", "Dóberman", 7, 70);
        Perro perro8 = new Perro("Bruno", "Boxer", 6, 50);
        Perro perro9 = new Perro("Molly", "Dalmata", 2, 45);
        Perro perro10 = new Perro("Zeus", "Rottweiler", 5, 75);
        
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        personas.add(persona6);
        personas.add(persona7);
        personas.add(persona8);
        personas.add(persona9);
        personas.add(persona10);
        
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);
        perros.add(perro5);
        perros.add(perro6);
        perros.add(perro7);
        perros.add(perro8);
        perros.add(perro9);
        perros.add(perro10);
        
        Servicio serv = new Servicio();
        
        serv.menu(personas, perros);
    }

}
