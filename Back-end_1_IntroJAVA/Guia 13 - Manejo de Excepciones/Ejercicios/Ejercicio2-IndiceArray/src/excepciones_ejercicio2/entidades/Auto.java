package excepciones_ejercicio2.entidades;

/**
 * @author Maximiliano Luna
 */
public class Auto {
    private String[] marcaAuto;

    public Auto() {
        marcaAuto = new String[4];
    }

    public Auto(String[] marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public void setMarcaAutos(String[] marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public String[] getMarcaAuto() {
        return marcaAuto;
    }
}
