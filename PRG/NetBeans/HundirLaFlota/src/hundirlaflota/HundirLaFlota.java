package hundirlaflota;

public class HundirLaFlota 
{
    int vaixellsIA;
    public static void main(String[] args) 
    {
        Joc joc = new Joc();
        joc.eleccioColocarVaixells(joc.demanarDades());
        while (joc.numVaixell>0)
        {
        joc.tiradaJugador();
        }
    }   
}