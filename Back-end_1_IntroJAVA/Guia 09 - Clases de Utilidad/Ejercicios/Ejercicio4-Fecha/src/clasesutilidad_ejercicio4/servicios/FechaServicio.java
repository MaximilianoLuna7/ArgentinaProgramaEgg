package clasesutilidad_ejercicio4.servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    public Date fechaNacimiento() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes (1 - 12): ");
        int mes = leer.nextInt() - 1;
        System.out.print("Año: ");
        int anio = leer.nextInt() - 1900;
        
        leer.close();
        return new Date(anio, mes, dia);
    }
    
    public Date fechaActual() {
        return new Date();
    }
    
    public int diferencia(Date fechaNacimiento, Date fechaActual) {
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }
}
