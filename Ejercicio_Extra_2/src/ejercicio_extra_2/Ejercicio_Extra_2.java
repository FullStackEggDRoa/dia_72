/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_extra_2;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.SalaCine;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Pelicula> peliculas= new ArrayList<>();
        ArrayList <Espectador> espectadores=new ArrayList<>();
        
        //Peliculas para pruebas - Información Base
        peliculas.add(new Pelicula("Harry Potter","Daniel Roa", 3, 13 ));
        peliculas.add(new Pelicula("Narnia","James Cameron", 5, 6));
        peliculas.add(new Pelicula("Percy Jackson","Leo Messi", 2, 9 ));
        
        //Espectantes para pruebas - Información Base
        
        espectadores.add(new Espectador("Galo", 21, 100, ""));
        espectadores.add(new Espectador("Martin", 4, 10,""));
        espectadores.add(new Espectador("Jose", 35, 50,""));
        espectadores.add(new Espectador("Marcos", 11, 20,""));
        espectadores.add(new Espectador("Manuel", 16, 7.5f,""));
        
        SalaCine sala1 = new SalaCine(8,6,peliculas.get(0),espectadores);
        Cine c1 = new Cine(peliculas,sala1,6.50f);
        
        
                
        System.out.println(c1.toString());
        c1.getSala().mostrarSala();
    }
    
}
