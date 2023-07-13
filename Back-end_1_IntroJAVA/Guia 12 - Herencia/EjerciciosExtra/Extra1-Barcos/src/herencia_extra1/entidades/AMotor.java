package herencia_extra1.entidades;

/**
 * @author Maximiliano Luna
 */
public class AMotor extends Barco{
    private double potencia;

    public AMotor() {
    }

    public AMotor(double potencia, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    @Override
    public double calcularModulo() {
        return super.getEslora()*10 + potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Barco a motor: " + "Matrícula: " + super.getMatricula() + ", eslora de " + super.getEslora() + " metros, fabricado en el " + super.getAnioFabricacion() + "\n Potencia de " + potencia + " CV";
    }
    
    
}
