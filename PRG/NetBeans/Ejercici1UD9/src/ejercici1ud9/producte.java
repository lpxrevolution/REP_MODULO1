package ejercici1ud9;
/**
 *
 * @author rbnre
 */
public class producte {
    
    private final String nom;
    private final int quantitat;
    
    public producte (String n, int q)
    {
        nom=n;
        quantitat=q;
    }
    public String getnom()
    {
        return nom;
    }
    public int getquantitat()
    {
        return quantitat;
    }   
}