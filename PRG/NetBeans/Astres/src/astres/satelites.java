package astres;
/**
 *
 * @author rbnre
 */
public class satelites extends astros 
{
    int distanciaPlaneta;
    String orbitaPlanetaria;
    String nomPlaneta;
    
    public satelites(int radio, int rotacio, int masa, float tempMedia, float grav, int distancia, String orbita, String planeta)
    {
        super(radio, rotacio, masa, tempMedia, grav);
        distanciaPlaneta = distancia;
        orbitaPlanetaria = orbita;
        nomPlaneta = planeta;
    }
    public void muestra()
    {}
}
