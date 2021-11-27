package intrucemayor;
import java.util.Scanner;

public class Intrucemayor 
{
    public static void main(String[] args) 
    {
        int numEleg = 0, numAnt=0, numIntentos =0, numErr = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre inicial:");
        numEleg = entrada.nextInt();
        
        if (numEleg>numAnt)
        {
            while (numEleg!=0)
            {
                System.out.print("\bIntrodueix el nombre:");
                numAnt = numEleg;
                numEleg = entrada.nextInt();
                numIntentos++;
                if(numEleg!=0)
                {
                    if(numEleg<numAnt)
                    {
                        System.out.println("fallo es menor");
                        numErr++;
                    }
                }
            }
            System.out.println("Total números introduits: "+numIntentos);
            System.out.println("Número de fallos: "+numErr);
        }
        else
            System.out.println("El nombre elegit no por 0 o inferior a aquest");
    }   
}
