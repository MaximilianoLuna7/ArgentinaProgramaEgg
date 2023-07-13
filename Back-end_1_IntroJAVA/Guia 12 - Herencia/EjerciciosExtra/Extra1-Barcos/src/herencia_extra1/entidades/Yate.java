package herencia_extra1.entidades;

/**
 * @author Maximiliano Luna
 */
public class Yate extends Barco {
    private double potencia;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(double potencia, int numCamarotes, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.getEslora()*10 + potencia + numCamarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate de lujo: " + "Matrícula: " + super.getMatricula() + ", eslora de " + super.getEslora() + " metros, fabricado en el " + super.getAnioFabricacion() + "\n Potencia de " + potencia + " CV\n Tiene " + numCamarotes + " camarotes en total";
    }
    
}
