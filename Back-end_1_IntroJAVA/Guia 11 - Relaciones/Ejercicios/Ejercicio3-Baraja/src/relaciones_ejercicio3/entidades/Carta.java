package relaciones_ejercicio3.entidades;

import java.util.Objects;

/**
 * @author Maximiliano Luna
 */
public class Carta {
    private int numero;
    private String palo;

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Carta otraCarta = (Carta) obj;
        return numero == otraCarta.numero && Objects.equals(palo, otraCarta.palo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, palo);
    }
}
