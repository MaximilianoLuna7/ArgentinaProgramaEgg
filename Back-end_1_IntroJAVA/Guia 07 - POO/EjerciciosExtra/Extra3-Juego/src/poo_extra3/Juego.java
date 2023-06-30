package poo_extra3;

import java.util.Scanner;

public class Juego {
    private int numero;
    private int intentos;
    private String jugador1;
    private String jugador2;

    public Juego() {
    }

    public Juego(int numero, int intentos, String jugador1, String jugador2) {
        this.numero = numero;
        this.intentos = intentos;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }
    
    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Jugador 1, ingresa tu nombre");
        jugador1 = leer.nextLine();
        System.out.print("Ingresa el numero a adivinar (de 1 a 1000): ");
        numero = leer.nextInt();
        leer.nextLine();
        System.out.println("Se juega con 10 intentos");
        intentos = 10; //Se da inicialmente el número de intentos para ser justos.
        
        for (int i = 0; i < 10; i++) {
            System.out.println(""); //Se imprimen muchos espacios en blanco para que el jugador 2 no vea las respuestas.
        }
        
        System.out.println("Jugador 2, ingresa tu nombre");
        jugador2 = leer.nextLine();
        System.out.println("---------------------");
        System.out.println(jugador2 + " tienes " + intentos + " intentos para adivinar el numero que ingreso " + jugador1);
        do {            
            System.out.print("Ingresa un numero: ");
            int numIngresado = leer.nextInt();
            if (numIngresado < numero) {
                System.out.println("Es mas alto que " + numIngresado);
                intentos--;
            } else if(numIngresado > numero) {
                System.out.println("Es mas bajo que " + numIngresado);
                intentos--;
            } else {
                System.out.println("Ganaste! El numero es " + numIngresado);
                intentos = -1;
            }
        } while (intentos > 0);
        
        if (intentos == 0) {
            System.out.println("Te quedaste sin intentos " + jugador2 + ". Perdiste");
            System.out.println("El ganador es  " + jugador1);
        } else {
            System.out.println("El ganador es " + jugador2);
        }
    }
}
