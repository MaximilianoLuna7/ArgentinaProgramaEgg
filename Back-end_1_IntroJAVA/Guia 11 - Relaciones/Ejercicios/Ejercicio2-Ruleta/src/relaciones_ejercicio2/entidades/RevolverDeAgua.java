package relaciones_ejercicio2.entidades;

import java.util.Random;

/**
 * @author Maximiliano Luna
 */
public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
        this.posicionActual = 0;
        this.posicionAgua = 0;
    }
    
    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6);
        posicionAgua = random.nextInt(6);
    }
    
    public boolean mojar() {
        return posicionActual == posicionAgua;
    }
    
    public void siguienteChorro() {
        if (posicionActual == 5) {
            posicionActual = 0;
        } else {
            posicionActual++;
        }
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Posicion actual del agua: " + posicionActual + ", Posicion de la carga de agua: " + posicionAgua;
    }
    
    
}
