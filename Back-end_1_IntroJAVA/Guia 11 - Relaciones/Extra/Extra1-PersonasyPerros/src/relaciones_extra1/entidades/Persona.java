package relaciones_extra1.entidades;

/**
 * @author Maximiliano Luna
 */
public class Persona {
    private String nombre, apellido;
    private int edad;
    private long dni;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
    public void adoptarPerro(Perro perro) {
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Apellido: " + apellido + " - Edad: " + edad + " - DNI: " + dni + " - Perro: " + (perro != null ? perro.getNombre() : "No tiene");
    }
}
