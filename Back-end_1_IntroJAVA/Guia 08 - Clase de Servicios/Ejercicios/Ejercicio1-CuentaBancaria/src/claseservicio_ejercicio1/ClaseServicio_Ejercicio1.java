package claseservicio_ejercicio1;

import claseservicio_ejercicio1.entidades.CuentaBancaria;
import claseservicio_ejercicio1.servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class ClaseServicio_Ejercicio1 {
//    Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
//    numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con
//    parámetros, getters y setters.
//    Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//    Método para crear cuenta pidiéndole los datos al usuario.
//    Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
//    Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
//    Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar
//    la cuenta en 0.
//    Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no
//    saque más del 20%.
//    Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//    Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CuentaBancariaServicio cuentaServ = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = cuentaServ.crearCuentaBancaria();
        System.out.println("---------------");
        
        cuentaServ.ingresarDinero(15000, cuenta1);
        System.out.println("---------------");
        cuentaServ.retirarDinero(20000, cuenta1);
        System.out.println("---------------");
        cuentaServ.extraccionRapida(cuenta1);
        System.out.println("---------------");
        cuentaServ.consultarSaldo(cuenta1);
        System.out.println("---------------");
        cuentaServ.consultarDatos(cuenta1);
        
        leer.close();
    }
    
}
