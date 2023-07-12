package relaciones_extra1.entidades;

/**
 * @author Maximiliano Luna
 */
public class Perro {
    private String nombre, raza;
    private int edad, tamano;
    private boolean adoptado;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, int tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.adoptado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + " - Raza: " + raza + " - Edad: " + edad + " - Tamaño: " + tamano + " - " + (adoptado ? "Tiene dueño" : "No tiene dueño");
    }
}
