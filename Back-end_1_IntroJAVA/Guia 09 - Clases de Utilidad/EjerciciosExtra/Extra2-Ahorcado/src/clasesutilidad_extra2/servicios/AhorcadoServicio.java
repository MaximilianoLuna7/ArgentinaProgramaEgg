package clasesutilidad_extra2.servicios;

import clasesutilidad_extra2.entidades.Ahorcado;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        char[] palabra = leer.nextLine().toCharArray();
        
        System.out.println("Ingrese la cantidad de itentos");
        int intentos = leer.nextInt();
        leer.nextLine();
        
        return new Ahorcado(palabra, 0, intentos);
    }
    
    public int longitud(Ahorcado ahorcado) {
        return ahorcado.getPalabra().length;
    }
    
    public void buscar(String letra, Ahorcado ahorcado) {
        boolean encontrado = false;
        int veces = 0;
        for (int i = 0; i < longitud(ahorcado); i++) {
            if (letra.equalsIgnoreCase(String.valueOf(ahorcado.getPalabra()[i]))) {
                encontrado = true;
                veces++;
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
            }
        }
        
        if (encontrado) {
            System.out.println("La letra " + letra + " está en la palabra " + veces + " vez/veces.");
        } else {
            ahorcado.setIntentos(ahorcado.getIntentos()-1);
            System.out.println("La letra " + letra + " no está en la palabra");
        }
    }
    
    public void letrasEncontradas(Ahorcado ahorcado) {
        System.out.println("Ya encontró " + ahorcado.getLetrasEncontradas() + " letras y le faltan " + (longitud(ahorcado)-ahorcado.getLetrasEncontradas()) + ".");
    }
    
    public void intentos(Ahorcado ahorcado) {
        System.out.println("Le quedan " + ahorcado.getIntentos() + " intentos.");
    }
    
    public void juego(Ahorcado ahorcado) {
        String palabra = new String(ahorcado.getPalabra());
        String letra = "";
        do {
            System.out.print("Ingrese una letra -> ");
            letra = leer.nextLine();
            
            System.out.println("Longitud de la palabra: " + longitud(ahorcado));
            buscar(letra, ahorcado);
            letrasEncontradas(ahorcado);
            intentos(ahorcado);
            System.out.println("----------------");
        } while (ahorcado.getLetrasEncontradas() != longitud(ahorcado) && ahorcado.getIntentos() != 0);
        
        if (ahorcado.getIntentos() == 0) {
            System.out.println("Perdiste, te quedaste sin itentos.");
        } else {
            System.out.println("Ganaste, adivinaste la palabra.");
        }
        System.out.println("La palabra buscada era " + palabra);
    }
    
    public void dejarDeLeer() {
        leer.close();
    }
}
