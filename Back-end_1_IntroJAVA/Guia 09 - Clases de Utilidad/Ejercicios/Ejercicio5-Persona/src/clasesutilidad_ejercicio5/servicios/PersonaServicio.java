package clasesutilidad_ejercicio5.servicios;
    
import clasesutilidad_ejercicio5.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("");
        Date nacimiento = fechaNacimiento();
        
        return new Persona(nombre, nacimiento);
    }
    
    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        return fechaActual.getYear() - persona.getNacimiento().getYear();
    }
    
    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
    }
    
    public void mostrarPersona(Persona persona) {
        System.out.println("Datos de la persona");
        System.out.println("Nombre: " + persona.getNombre());
        int dia = persona.getNacimiento().getDay();
        int mes = persona.getNacimiento().getMonth() + 1;
        int anio = persona.getNacimiento().getYear() + 1900;
        System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + anio);
    }
    
    //Metodo del ejercicio anterior
    public Date fechaNacimiento() {        
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes (1 - 12): ");
        int mes = leer.nextInt() - 1;
        System.out.print("Año: ");
        int anio = leer.nextInt() - 1900;
        
        return new Date(anio, mes, dia);
    }
    
    public void dejarDeLeer() {
        leer.close();
    }
}
