import java.util.ArrayList;
/**
 * @autor Cesar Reyes
 * @version 1 (31-agosto-2017)
 */
public class Biblioteca
{
    private ArrayList<String> canciones;
    private Reproductor reproductor;
    
    //Constructor
    public Biblioteca()
    {
        canciones = new ArrayList<String>();
        reproductor = new Reproductor();
    }
    
    //Metodos importantes
    
    public void agregarCancion(String nombreArchivo)
    {
        this.canciones.add(nombreArchivo); //this se usa para llamar algun metodo dentro de la mimsa clase
    }
    
    public void reproducirCancion(int numeroCancion)
    {
        reproductor.reproducir(canciones.get(numeroCancion));
    }
}