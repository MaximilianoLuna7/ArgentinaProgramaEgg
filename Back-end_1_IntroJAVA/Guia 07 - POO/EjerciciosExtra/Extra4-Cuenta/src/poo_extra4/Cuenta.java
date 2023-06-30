package poo_extra4;

import java.util.Scanner;

public class Cuenta {
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
    
    public void mostrarCuenta() {
        System.out.println(toString());
    }
    
    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        double retiro;
        
        do {            
            System.out.print("Ingrese la cantidad que desea retirar -> ");
            retiro = leer.nextInt();
            if (retiro > saldo) {
                System.out.println("Imposible. La cantidad ingresada supera el saldo actual");
            }
        } while (retiro > saldo);
        
        saldo -= retiro;
        System.out.println(titular + " retiro " + retiro + ". Su saldo actual es: " + saldo);
    }
}
