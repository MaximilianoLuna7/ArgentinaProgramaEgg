package claseservicio_extra2.servicios;

import claseservicio_extra2.entidades.NIF;
import java.util.Scanner;

public class NIFServicio {
    Scanner leer = new Scanner(System.in);
    char[] caracteresNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    
    public NIF crearNIF() {
        System.out.print("Ingrese su DNI: ");
        long dni = leer.nextLong();
        
        int resto = (int) dni % 23;
        char letra = caracteresNIF[resto];
        
        return new NIF(dni, letra);
    }
    
    public void mostrar(NIF nif) {
        String numero = String.format("%08d", nif.getDni()); //El número se completa para tener 8 dígitos
        System.out.println(numero + "-" + nif.getLetra());
    }
}
