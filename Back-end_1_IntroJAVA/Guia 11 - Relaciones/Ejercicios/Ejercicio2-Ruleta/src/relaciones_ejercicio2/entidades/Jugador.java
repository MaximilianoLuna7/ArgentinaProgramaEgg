package relaciones_ejercicio2.entidades;

/**
 * @author Maximiliano Luna
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador" + id;
        this.mojado = false;
    }
    
//    Método para dispararse
    public boolean disparo(RevolverDeAgua revolver) {
        if (revolver.mojar()) {
            this.mojado = true;
        } else {
            revolver.siguienteChorro();
        }
        return revolver.mojar();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
}
