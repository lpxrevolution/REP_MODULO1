package collatz;
import java.util.Scanner;

public class Collatz 
{
    public static void main(String[] args) 
    {
        int numIntentos = 0;
        long puntero=0, numMax=0, numEleg;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular:");
        numEleg = entrada.nextLong();
        puntero = numEleg;
        numMax = puntero;
        while (puntero>1)
        {
            if (puntero%2==0)
                puntero=puntero/2;   
            else
            {
                puntero=(puntero*3)+1;
                if (puntero>numMax)
                    numMax = puntero;
            }
            numIntentos++;
            System.out.print(puntero+", ");
        }
        System.out.println("\nEl número llego a valer 1 tras "+numIntentos+" intentos y su valor máximo ha sido "+numMax);
    }    
}
