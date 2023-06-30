package claseservicio_ejercicio1.servicios;

import claseservicio_ejercicio1.entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuentaBancaria() {
        System.out.println("Ingrese su numero de cuenta:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su numero de DNI:");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese su saldo actual:");
        double saldoActual = leer.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    public void ingresarDinero(double dinero, CuentaBancaria cuenta) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + dinero);
        System.out.println("Ingreso $" + dinero + " en su cuenta.");
    }
    
    public void retirarDinero(double dinero, CuentaBancaria cuenta) {
        if (cuenta.getSaldoActual() < dinero) {
            System.out.println("Solo se podra retirar $" + cuenta.getSaldoActual() + " de su cuenta.");
            cuenta.setSaldoActual(0);
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - dinero);
            System.out.println("Retiro $" + dinero + " de su cuenta.");
        }
    }
    
    public void extraccionRapida(CuentaBancaria cuenta) {
        double limite = cuenta.getSaldoActual()*0.2;
        System.out.println("Ingrese la cantidad a retirar: ");
        double dinero = leer.nextDouble();
        
        if (dinero <= limite) {
            cuenta.setSaldoActual(cuenta.getSaldoActual()-dinero);
            System.out.println("Retiro $" + dinero + " de su cuenta.");
        } else {
            System.out.println("La cantidad ingresada supera el limite permitido.");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Su saldo es: $" + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Datos de la cuenta:");
        System.out.println(cuenta.toString());
    }
}
