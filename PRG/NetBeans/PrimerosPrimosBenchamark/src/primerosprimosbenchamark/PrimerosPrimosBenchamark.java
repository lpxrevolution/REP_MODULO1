package primerosprimosbenchamark;

public class PrimerosPrimosBenchamark 
{
    public static void main(String[] args) 
    {
        int numeroPrimosMax = 100;
        int numPrimosEncontrados=0;
        boolean esPrimo=false;
        System.out.println("Empezamos");
        for (int i=1 ; i<numeroPrimosMax;i++)
        {
            if(i==2) 
            {
                numPrimosEncontrados++;
                System.out.print(i+", ");
            }
            for (int b=1;b==i-1;b++)
            {
                if(i%b==0)
                    esPrimo=false;
                else
                    esPrimo=true;
            }
            if (esPrimo)
            {
                numPrimosEncontrados++;
                System.out.print(i+", ");
            }
        }
        System.out.println("\nSe han encontrado "+numPrimosEncontrados);
    }
}
