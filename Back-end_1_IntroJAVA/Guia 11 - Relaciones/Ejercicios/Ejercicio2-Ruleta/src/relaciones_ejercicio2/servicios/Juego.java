package relaciones_ejercicio2.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones_ejercicio2.entidades.Jugador;
import relaciones_ejercicio2.entidades.RevolverDeAgua;

/**
 * @author Maximiliano Luna
 */
public class Juego {
    Scanner leer = new Scanner(System.in);
    private RevolverDeAgua revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
        this.revolver = new RevolverDeAgua();
        revolver.llenarRevolver();
        this.jugadores = llenarJugadores();
    }
    
    public ArrayList<Jugador> llenarJugadores() {
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidadJugadores = leer.nextInt();
        if (cantidadJugadores > 6) {
            System.out.println("Se establecerá por defecto el máximo que es 6 jugadores.");
            cantidadJugadores = 6;
        }
        
        ArrayList<Jugador> auxJugadores = new ArrayList<>();
        for (int i = 0; i < cantidadJugadores; i++) {
            Jugador auxJugador = new Jugador(i+1);
            auxJugadores.add(auxJugador);
        }
        
        return auxJugadores;
    }
    
    public boolean ronda(Jugador jugadorActual) {
        if (jugadorActual.disparo(revolver)) {
            System.out.println("El " + jugadorActual.getNombre() + " se mojó.");
        } else {
            System.out.println("El " + jugadorActual.getNombre() + " no se mojó.");
        }
        return jugadorActual.disparo(revolver);
    }

    public void dejarDeLeer() {
        leer.close();
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
}
