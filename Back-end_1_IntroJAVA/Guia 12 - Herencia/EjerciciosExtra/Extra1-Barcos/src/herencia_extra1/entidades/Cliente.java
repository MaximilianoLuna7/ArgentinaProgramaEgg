package herencia_extra1.entidades;

/**
 * @author Maximiliano Luna
 */
public class Cliente {
    private String nombre;
    private long dni;

    public Cliente() {
    }

    public Cliente(String nombre, long dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", DNI: " + dni;
    }
}
