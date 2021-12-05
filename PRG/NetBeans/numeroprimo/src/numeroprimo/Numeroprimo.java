package numeroprimo;

import java.util.Scanner;

public class Numeroprimo 

{
    public static void main(String[] args) 

    {

        int numEleg, puntero;

        boolean primo=false;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introdueix un nombre:");

        numEleg= entrada.nextInt();

        puntero = numEleg;

        
        if (numEleg == 2)
            System.out.println("El nombre " +numEleg+" es primer");
        else
        {
            while (puntero > 1)

            {

                if (numEleg%puntero == 0)

                    primo = false;

                else

                    primo = true;

                puntero--;

            }

        if (primo)

            System.out.println("El nombre " +numEleg+" es primer");

        else

            System.out.println("El nombre no es primo el teu nombre es "+numEleg);
        }
        System.out.println(numEleg);

    }

}