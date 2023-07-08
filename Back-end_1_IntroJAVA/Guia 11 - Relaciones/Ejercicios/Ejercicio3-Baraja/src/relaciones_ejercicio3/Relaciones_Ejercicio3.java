package relaciones_ejercicio3;

import java.util.ArrayList;
import relaciones_ejercicio3.entidades.Baraja;
import relaciones_ejercicio3.entidades.Carta;

/**
 * @author Maximiliano Luna
 */
public class Relaciones_Ejercicio3 {
//    Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//    y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//    contener un método toString() que retorne el número de carta y el palo. La baraja estará
//    compuesta por un conjunto de cartas, 40 exactamente.
//    Las operaciones que podrá realizar la baraja son:
//    • barajar(): cambia de posición todas las cartas aleatoriamente.
//    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//    se haya llegado al final, se indica al usuario que no hay más cartas.
//    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
//    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//    debemos indicárselo al usuario.
//    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//    indicárselo al usuario
//    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//    luego se llama al método, este no mostrara esa primera carta.
        
    public static void main(String[] args) {
        Baraja baraja1 = new Baraja();
        
        System.out.println("Baraja inicial");
        baraja1.mostrarBaraja();
        System.out.println("");
        
        baraja1.barajar();
        System.out.println("Baraja mezclada");
        baraja1.mostrarBaraja();
        System.out.println("");
        
        System.out.println("Sacar una carta...");
        System.out.println(baraja1.siguienteCarta());
        System.out.println("Sacar otra carta...");
        System.out.println(baraja1.siguienteCarta());
        System.out.println("");
        
        System.out.println("Dar 10 cartas");
        ArrayList<Carta> cartasRepartidas = baraja1.darCartas(10);
        for (Carta carta : cartasRepartidas) {
            System.out.println(carta);
        }
        System.out.println("");
        
        System.out.println("Baraja actual");
        baraja1.mostrarBaraja();
        System.out.println("");
        
        System.out.println("Monton");
        ArrayList<Carta> monton = baraja1.cartasMonton();
        for (Carta carta : monton) {
            System.out.println(carta);
        }
        
        
    }

}
