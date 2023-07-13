package herencia_extra1.entidades;

/**
 * @author Maximiliano Luna
 */
public class Velero extends Barco {
    private int numeroMastiles;

    public Velero() {
    }
    
    public Velero(int numeroMastiles, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.getEslora()*10 + numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero: " + "Matrícula: " + super.getMatricula() + ", eslora de " + super.getEslora() + " metros, fabricado en el " + super.getAnioFabricacion() + "\n Número de mástiles: " + numeroMastiles;
    }
    
    
}
