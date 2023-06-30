package clasesutilidad_extra2.entidades;
/**
 * @author Maximiliano Luna
 */
public class Ahorcado {
    private char[] palabra;
    private int letrasEncontradas, intentos;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int intentos) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.intentos = intentos;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
}
