package astres;
/**
 *
 * @author rbnre
 */
public abstract class astros
{
    int radioEcuatorial;
    int rotacioSobreEje;
    int masa;
    float tempMedia;
    float gravedad;
    
    public astros(int radio, int rotacio, int masa, float tempMedia, float grav)
    {
    radioEcuatorial = radio;
    rotacioSobreEje = rotacio;
    masa = this.masa;
    tempMedia = this.tempMedia;
    gravedad = grav;
    }
    protected abstract void muestra();
}
