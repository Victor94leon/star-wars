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
    
    public void generateStarWarsName (String apellido,String nombre, String apellidoMadre, String ciudad) {
        String nombreCompleto = null;
        
        String apellidoUsuario = apellido;
        String nombreUsuario = nombre;
        String apellidoMadreUsuario = apellidoMadre;        
        String ciudadUsuario = ciudad;
        
        String nombrePelicula = "";
        String apellidoPelicula = "";
        for(int index = 0; index<PRIMERAS_TRES_LETRAS; index++) {
            nombrePelicula += apellidoUsuario.charAt(index);
        }
        
        for(int index = 0; index<PRIMERAS_TRES_LETRAS; index++) {
            nombrePelicula += nombreUsuario.charAt(index);
        }
        
        for(int index = 0; index<PRIMERAS_DOS_LETRAS; index++) {
            apellidoPelicula += apellidoMadreUsuario.charAt(index);
        }
        
        for(int index = 0; index<PRIMERAS_TRES_LETRAS; index++) {
            apellidoPelicula += ciudadUsuario.charAt(index);
        }
        nombreCompleto = nombrePelicula + " " + apellidoPelicula;     
        System.out.println(nombreCompleto);
    }
}
