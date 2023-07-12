package relaciones_extra1.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones_extra1.entidades.Perro;
import relaciones_extra1.entidades.Persona;

/**
 * @author Maximiliano Luna
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    
    public void agregarPersona(ArrayList<Persona> personas) {
        personas.add(ingresarPersona());
        System.out.println("Nueva persona guardada.");
    }
    
    public void agregarPerro(ArrayList<Perro> perros) {
        perros.add(ingresarPerro());
        System.out.println("Nuevo perrito guardado.");
    }
    
    public void mostrarPersonas(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
    
    public void mostrarPerros(ArrayList<Perro> perros) {
        for (Perro perro : perros) {
            System.out.println(perro.toString());
        }
    }
    
    public void adoptar(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        System.out.println("Quién va a adoptar?");
        String nombrePersona = leer.nextLine();
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombrePersona)) {
                System.out.println("Perritos disponibles");
                mostrarPerros(perros);
                System.out.println("");
                System.out.println("Ingrese el nombre del perro que quiere adoptar");
                String nombrePerro = leer.nextLine();
                for (Perro perro : perros) {
                    if (perro.getNombre().equalsIgnoreCase(nombrePerro)) {
                        if (perro.isAdoptado()) {
                            System.out.println("Este perro ya tiene dueño.");
                        } else {
                        persona.adoptarPerro(perro);
                        perro.setAdoptado(true);
                        System.out.println(persona.getNombre() + " adoptó a " + perro.getNombre());
                        }
                    }
                }
            }
        }
    }
    
    public Persona ingresarPersona() {
        System.out.print("Ingrese el nombre -> ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese el apellido -> ");
        String apellido = leer.nextLine();
        System.out.print("Ingrese la edad -> ");
        int edad = leer.nextInt();
        System.out.print("Ingrese el número de DNI -> ");
        long dni = leer.nextLong();
        
        return new Persona(nombre, apellido, edad, dni);
    }
    
    public Perro ingresarPerro() {
        System.out.print("Ingrese el nombre del perrito -> ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese la raza -> ");
        String raza = leer.nextLine();
        System.out.print("Qué edad tiene el perrito'? -> ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el tamaño del perrito en cm -> ");
        int tamano = leer.nextInt();
        
        return new Perro(nombre, raza, edad, tamano);
    }
    
    public void menu(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        int opcion;
        
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Agregar una persona a la lista...");
                    agregarPersona(personas);
                    break;
                case 2:
                    System.out.println("Agregar un perro a la lista...");
                    agregarPerro(perros);
                    break;
                case 3:
                    System.out.println("Personas registradas...");
                    mostrarPersonas(personas);
                    break;
                case 4:
                    System.out.println("Perros disponibles...");
                    mostrarPerros(perros);
                    break;
                case 5:
                    System.out.println("Inicia el proceso de adopción");
                    adoptar(personas, perros);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            
            System.out.println(""); // Separador entre iteraciones del menú

        } while (opcion != 6);
        
        leer.close();
    }
    
    public void mostrarMenu() {
        System.out.println("========== MENÚ ==========");
        System.out.println("1. Ingresar una persona");
        System.out.println("2. Ingresar un perro");
        System.out.println("3. Mostrar personas");
        System.out.println("4. Mostrar perros");
        System.out.println("5. Adoptar un perro");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: ");
    }
}
