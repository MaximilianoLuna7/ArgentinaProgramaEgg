package colecciones_extra2.entidades;

/**
 * @author Maximiliano Luna
 */
public class CantanteFamoso {
    private String nombre, discoMasVendido;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    @Override
    public String toString() {
        return "Artista:" + nombre + ", Disco con más ventas: " + discoMasVendido;
    }
}
