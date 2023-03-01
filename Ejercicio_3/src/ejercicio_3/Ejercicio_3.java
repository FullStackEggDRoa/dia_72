/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import Entidades.Baraja;

/**
 *
 * @author droa
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baraja b1 = new Baraja();
        System.out.println(b1.toString().replace(",", ""));
        System.out.println("..:: BARAJANDO ::.. ");
        b1.barajar();
        System.out.println(b1.toString().replace(",", ""));
        System.out.println("..:: MOSTRAR UNA CARTA BARAJA ::.. ");
        b1.siguienteCarta();
        System.out.println(b1.toString().replace(",", ""));
        b1.cartasDisponibles();
        b1.cartasMonton();
        b1.darCartas();
        System.out.println(b1.toString().replace(",", ""));
        b1.cartasDisponibles();
        b1.cartasMonton();
    }
    
}
