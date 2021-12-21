
package enfonalaflota;

import java.util.Scanner;


public class EnfonaLaFlota 
{ 
    public static void main(String[] args)
    {
        String[][] taulerUI;
        String[][] taulerIA;
        int tamanyTauler = 0;
        int numVaixellsIA;
        int opcioElegida;
        opcioElegida = demanarDades();
        tamanyTauler = calculaTauler(opcioElegida);
        taulerUI = new String[tamanyTauler][tamanyTauler];
        taulerIA = new String[tamanyTauler][tamanyTauler];
        numVaixellsIA = eleccioColocarVaixells(opcioElegida);
        crearTauler(tamanyTauler, taulerIA);
        crearTauler(tamanyTauler, taulerUI);
        mostrarTauler(taulerUI);
        
        while (numVaixellsIA>0)
        {
        numVaixellsIA = tiradaJugador(numVaixellsIA);
        System.out.println(numVaixellsIA);
        }
    }
    public static int entradaConsola(String text)
    {
        int eleccio;
        Scanner entrada = new Scanner(System.in);
        System.out.println(text);
        eleccio = entrada.nextInt();
        return eleccio;
    }
    public static int demanarDades()
    {
        String text = "Benvingut a Anfonar la Flota.\nElija la dificultad del joc:\n1.Fácil.\n2.Mitjà.\n3.Difícil.\n4.Personalitzat";
        return entradaConsola(text);
    }
    public static int calculaTauler(int opcio)
    {
        int tamanyTauler = 0;
        switch (opcio)
        {
            case 4:
                int opcioB = 0;
                do
                {
                    String text = "Introdueix el tamany del tauler (sols es acepta entre 8 y 20)";
                    opcioB = entradaConsola(text);
                }
                while (opcioB<8||opcioB>20);
                tamanyTauler = opcioB+1;
                break;
            default:
                tamanyTauler = 11;
                break;
        }
        return tamanyTauler;
    }
    public static int eleccioColocarVaixells(int i)
    {
        int numVaixells = 0;
            switch(i)
            {
                case 1:
                    System.out.println("Ha elegit joc fácil");
                    numVaixells=vaixells("F");
                    break;
                case 2:
                    System.out.println("Ha elegit joc mitgá");
                    numVaixells=vaixells("M");
                    break;
                case 3:
                    System.out.println("Ha elegit joc difícil");
                    numVaixells=vaixells("D");
                    break;
                case 4:
                    System.out.println("Ha elegit joc personalitzat");
                    break;
                default:
                    System.out.println("Elecció incorrecta, torna a intentar");
                    i = demanarDades();
                    numVaixells = eleccioColocarVaixells(i);
                    break;
            }
            return numVaixells;
    }
    public static int vaixells(String opcio)
    {
        
        int numVaixells = 0, numIntents, numLlancha, numVaixell, numCuirassat, numPortaavions;
        
        switch (opcio)
        {
            case "F":
                numVaixells = 10;
                numIntents = 50;
                numLlancha = 5;
                numVaixell = 3;
                numCuirassat = 1;
                numPortaavions = 1;
                break;
            case "M":
                numVaixells = 5;
                numIntents = 30;
                numLlancha = 2;
                numVaixell = 1;
                numCuirassat = 1;
                numPortaavions = 1;
                break;
            case "D":
                numVaixells = 2;
                numIntents = 10;
                numLlancha = 1;
                numVaixell = 1;
                break; 
            case "P":
                break;
        }
        return numVaixells;
    }  
    public static void mostrarTauler(String tauler[][])
    {
        for (int y = 0;y<tauler.length;y++)
        {
            for (int x = 0;x<tauler.length;x++)
            {
                System.out.printf("%4s", tauler[y][x]);
            }
            System.out.print("\n");
        }
    }
    public static void crearTauler(int tamanyTauler, String tauler[][])
    {
        String[] vectorABC = {" ","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};

        for (int y = 0;y<tamanyTauler;y++)
        {
            for (int x = 0;x<tamanyTauler;x++)
            {
                if(y==0)
               {
                    if (x>0)
                    {
                        tauler[y][x] = String.valueOf(x);
                        //System.out.printf("%4s",String.valueOf(tauler[y][x]));
                    }
                    else
                    {
                        tauler[y][x] = " ";
                        //System.out.printf("%4s",tauler[y][x]);
                    }
                }
                else
                {
                    if(x==0)
                    {
                        tauler[y][x] = vectorABC[y];
                    }
                    else
                        tauler[y][x] = "-";
                    //System.out.printf("%4s",tauler[y][x]);
                }
            }
            //System.out.print("\n");
        }
    }
    public static void posicionarVaixellsIA(int tamanyTauler)
    {
        int posicioVaixellY;
        int posicioVaixellX;
    }
    public static void actualitzarTauler(int tamanyTauler, String taulerUI[][])
    {
        for (int y = 0;y<tamanyTauler;y++)
        {
            for (int x = 0;x<tamanyTauler;x++)
            {
                System.out.printf("%4s",taulerUI[y][x]);
            }
            System.out.print("\n");
        }
    }
    public static int tiradaJugador(int numVaixellsIA)
    {
        int eleccio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("El tauler ha sigut actualitzat, per favor seleccione la seguent jugada:\n1. Efectuar atac\n2. Visualitzar el tauler\n3. Visualitzar estadistiques del joc");
        eleccio = entrada.nextInt();
        switch (eleccio)
        {
            case 1:
                numVaixellsIA--;
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return numVaixellsIA;
    }
}
