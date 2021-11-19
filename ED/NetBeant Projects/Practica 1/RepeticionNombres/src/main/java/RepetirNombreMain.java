public class RepetirNombreMain 
{
    public static void main(String[] args) 
    {
        String textoaMostrar = "Lopez Pastor";
        int punteroRepeticion = 1;
        int totalRepeticiones = 100;
        while (punteroRepeticion<totalRepeticiones)
        {
            System.out.println(textoaMostrar);
            punteroRepeticion++;
        }
    }  
}
