package relaciones_ejercicio3.entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Maximiliano Luna
 */
public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> BARAJAMODELO;

    public Baraja() {
        this.cartas = new ArrayList<>();
        crearBaraja(cartas);
        this.BARAJAMODELO = new ArrayList<>();
        crearBaraja(BARAJAMODELO);
    }
    
    public void crearBaraja(ArrayList<Carta> baraja) {
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    Carta nuevaCarta = new Carta(i, palo);
                    baraja.add(nuevaCarta);
                }
            }
        }
    }
    
    public void barajar() {
        Collections.shuffle(cartas);
    }
    
    public Carta siguienteCarta () {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas en la baraja.");
            return null;
        } else {
            return cartas.remove(0);
        }
    }
    
    public int cartasDisponibles() {
        return cartas.size();
    }
    
    public ArrayList<Carta> darCartas(int cantidadPedida) {
        ArrayList<Carta> cartasPedidas = new ArrayList<>();
        if (cantidadPedida > cartasDisponibles()) {
            System.out.println("No quedan suficientes cartas en la baraja");
            return null;
        }
        for (int i = 0; i < cantidadPedida; i++) {
            cartasPedidas.add(cartas.remove(0));
        }
        return cartasPedidas;
    }
    
    public ArrayList<Carta> cartasMonton() {
        if (cartasDisponibles() == 40) {
            System.out.println("No salió ninguna carta");
            return null;
        } else {
            ArrayList<Carta> monton = new ArrayList<>();
            for (Carta carta : BARAJAMODELO) {
                if (!cartas.contains(carta)) {
                    monton.add(carta);
                }
            }
            return monton;
        }
    }
    
    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
    
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getBARAJAMODELO() {
        return BARAJAMODELO;
    }

    public void setBARAJAMODELO(ArrayList<Carta> BARAJAMODELO) {
        this.BARAJAMODELO = BARAJAMODELO;
    }
}
