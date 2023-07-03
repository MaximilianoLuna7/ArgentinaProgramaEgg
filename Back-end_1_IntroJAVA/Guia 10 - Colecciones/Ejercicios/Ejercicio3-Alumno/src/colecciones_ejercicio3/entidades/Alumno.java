package colecciones_ejercicio3.entidades;
/**
 * @author Maximiliano Luna
 */
public class Alumno {
    private String nombre;
    private int[] notas;

    public Alumno() {
    }

    public Alumno(String nombre, int[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
}
