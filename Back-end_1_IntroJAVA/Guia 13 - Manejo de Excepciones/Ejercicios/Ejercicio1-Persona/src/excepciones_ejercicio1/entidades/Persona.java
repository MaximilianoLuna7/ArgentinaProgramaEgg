package excepciones_ejercicio1.entidades;

/**
 * @author Maximiliano Luna
 */
public class Persona {
    private String nombre;
    private int edad;
    private char sexo; // H, M o O.
    private double peso, altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años, Sexo: " + sexo + ", Peso: " + peso + " kg, Altura: " + altura + " m.";
    }
}
