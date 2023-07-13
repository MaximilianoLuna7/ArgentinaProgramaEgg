package herencia_extra1.servicios;

import herencia_extra1.entidades.Alquiler;
import herencia_extra1.entidades.Barco;
import herencia_extra1.entidades.Cliente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class ServicioAlquiler {
    Scanner leer = new Scanner(System.in);
    
    public Cliente ingresarCliente() {
        System.out.println("Cuál es su nombre?");
        String nombreCliente = leer.nextLine();
        System.out.println("Ingrese su número de DNI");
        long dni = leer.nextLong();
        
        return new Cliente(nombreCliente, dni);
    }
    
    public Alquiler alquilarBarco(Cliente cliente, ArrayList<Barco> barcosDisponibles) {
        System.out.println(cliente.getNombre() + " ingrese la fecha en la que iniciará su alquiler");
        LocalDate fechaAlquiler = ingresarFecha();
        System.out.println("-------------------------");
        System.out.println("Ahora ingrese la fecha en la que cesará su alquiler");
        LocalDate fechaDevolucion = ingresarFecha();
        System.out.println("-------------------------");
        System.out.println("Esta es la lista de barcos disponibles");
        mostrarBarcos(barcosDisponibles);
        System.out.println("-------------------------");
        Barco barco = elegirBarco(barcosDisponibles);
        System.out.println("-------------------------");
        Random random = new Random();
        int posicionAmarre = random.nextInt(20) + 1;
        System.out.println("Se le asignará una posición de amarre número " + posicionAmarre);
        
        return new Alquiler(cliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
    }
    
    public void mostrarAlquiler(Alquiler alquiler) {
        System.out.println("Datos del cliente:");
        System.out.println("  Nombre: " + alquiler.getCliente().getNombre());
        System.out.println("  DNI: " + alquiler.getCliente().getDni());
        
        System.out.println("Barco alquilado:");
        System.out.println(alquiler.getBarco().toString());
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        String fechaAlquiler = alquiler.getFechaAlquiler().format(formatter);
        System.out.println("Inicio del alquiler: " + fechaAlquiler);
        System.out.println("El alquiler durará " + alquiler.diasOcupacion() + " días.");
        
        System.out.println("Se le asignó la posición " + alquiler.getPosicionAmarre() + " de amarre.");
        System.out.println("-------------------------");
    }
    
    public void mostrarBarcos(ArrayList<Barco> barcosDisponibles) {
        int numeroBarco = 1;
        for (Barco barco : barcosDisponibles) {
            System.out.println("Barco " + numeroBarco);
            System.out.println(barco.toString());
            numeroBarco++;
            System.out.println("");
        }
    }
    
    public LocalDate ingresarFecha() {
        System.out.print("Día (dd): ");
        int dia = leer.nextInt();
        System.out.print("Mes (mm): ");
        int mes = leer.nextInt();
        System.out.print("Año (aaaa): ");
        int anio = leer.nextInt();
        leer.nextLine();
        
        return LocalDate.of(anio, mes, dia);
    }
    
    public Barco elegirBarco(ArrayList<Barco> barcosDisponibles) {
        boolean encontrado = false;
        Barco barcoElegido = null;
        do {
            System.out.println("Ingrese la matrícula del barco que quiere alquilar");
            String matricula = leer.nextLine();
            for (Barco barco : barcosDisponibles) {
                if (barco.getMatricula().equalsIgnoreCase(matricula)) {
                    encontrado = true;
                    barcoElegido = barco;
                }
            }
            if (!encontrado) {
                System.out.println("La matrícula ingresada no coincide con alguno de nuestros barcos.");
            }
        } while (!encontrado);
        
        return barcoElegido;
    }
}
