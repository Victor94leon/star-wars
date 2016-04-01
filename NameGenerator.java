import java.util.Scanner;
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final int PRIMERAS_TRES_LETRAS = 3;
    private static final int PRIMERAS_DOS_LETRAS = 2;
    
    public void generateStarWarsName () {
        Scanner teclado = new Scanner(System.in);
        String nombreCompleto = null;
        
        System.out.println("Introduce tu apellido");
        String apellido = teclado.next();
        
        System.out.println("Introduce tu nombre");
        String nombre = teclado.next();
        
        System.out.println("Introduce el apellido de tu madre");
        String apellidoMadre = teclado.next();
        
        System.out.println("Introduce la ciudad donde naciste");
        String ciudad = teclado.next();
        
        String nombrePelicula = "";
        String apellidoPelicula = "";
        for(int index = 0; index<PRIMERAS_TRES_LETRAS; index++) {
            nombrePelicula += apellido.charAt(index);
        }
        
        for(int index = 0; index<PRIMERAS_TRES_LETRAS; index++) {
            nombrePelicula += nombre.charAt(index);
        }
        
        for(int index = 0; index<PRIMERAS_DOS_LETRAS; index++) {
            apellidoPelicula += apellidoMadre.charAt(index);
        }
        
        for(int index = 0; index<PRIMERAS_TRES_LETRAS; index++) {
            apellidoPelicula += ciudad.charAt(index);
        }
        nombreCompleto = nombrePelicula + " " + apellidoPelicula;     
        System.out.println(nombreCompleto);
    }
}
