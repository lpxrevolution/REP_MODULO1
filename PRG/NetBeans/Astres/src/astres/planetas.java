package astres;

/**
 *
 * @author rbnre
 */
public class planetas extends astros 
{
    int distanciaSol;
    String orbitaSol;
    boolean teSatelites;
    
    public planetas(int radio, int rotacio, int masa, float tempMedia, float grav, int distancia, String orbita, boolean teSat)
    {
        super(radio, rotacio, masa, tempMedia, grav);
        distanciaSol = distancia;
        orbitaSol = orbita;
        teSatelites = teSat;
    }
    public void muestra()
    {}
}
