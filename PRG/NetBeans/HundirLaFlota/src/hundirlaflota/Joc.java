package hundirlaflota;

import java.util.Scanner;

public class Joc 
{
    Scanner entrada = new Scanner(System.in);
    int tamanyTauler;
    int eleccio;
    String[] vectorABC = {" ","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};
    String taulerUI[][];
    String taulerIA[][];
    int numVaixells, numIntents, numLlancha, numVaixell, numCuirassat, numPortaavions;
        
    public int demanarDades()
    {
        eleccio = 0;
        //System.out.println("Introdueix el temany de la cuadricula entre 10 y 20:");
        //tamanyTauler = entrada.nextInt()+1;
        System.out.println("Benvingut a Anfonar la Flota.\nElija la dificultad del joc:\n1.Fácil.\n2.Mitjà.\n3.Difícil.\n4.Personalitzat");
        eleccio = entrada.nextInt();
        return eleccio;
    }
    public void crearTauler()
    {
        taulerUI = new String[tamanyTauler][tamanyTauler];
        taulerIA = new String[tamanyTauler][tamanyTauler];
        for (int y = 0;y<tamanyTauler;y++)
        {
            for (int x = 0;x<tamanyTauler;x++)
            {
                if(y==0)
               {
                    if (x>0)
                    {
                        taulerUI[y][x] = String.valueOf(x);
                        System.out.printf("%4s",String.valueOf(taulerUI[y][x]));
                    }
                    else
                    {
                        taulerUI[y][x] = " ";
                        System.out.printf("%4s",taulerUI[y][x]);
                    }
                }
                else
                {
                    if(x==0)
                    {
                        taulerUI[y][x] = vectorABC[y];
                    }
                    else
                        taulerUI[y][x] = "-";
                    System.out.printf("%4s",taulerUI[y][x]);
                }
            }
            System.out.print("\n");
        }
        taulerIA = taulerUI;
    }
    public void eleccioColocarVaixells(int i)
    {
            switch(i)
            {
                case 1:
                    System.out.println("Ha elegit joc fácil");
                    vaixellsFacil();
                    break;
                case 2:
                    System.out.println("Ha elegit joc mitgá");
                    vaixellsMitga();
                    break;
                case 3:
                    System.out.println("Ha elegit joc difícil");
                    vaixellsDificil();
                    break;
                case 4:
                    System.out.println("Ha elegit joc personalitzat");
                    break;
                default:
                    System.out.println("Elecció incorrecta, torna a intentar");
                    eleccioColocarVaixells(demanarDades());
                    break;
                case 0:
                    actualitzarTauler();
                    break;
            }
    }
    public void vaixellsFacil()
    {
        numVaixells = 10;
        numIntents = 50;
        numLlancha = 5;
        numVaixell = 3;
        numCuirassat = 1;
        numPortaavions = 1;
        tamanyTauler = 11;
        crearTauler();
        colocarBarcosIA("llancha", numLlancha);
    }
    public void vaixellsMitga()
    {
        numVaixells = 5;
        numIntents = 30;
        numLlancha = 2;
        numVaixell = 1;
        numCuirassat = 1;
        numPortaavions = 1;
        tamanyTauler = 11;
        crearTauler();
    }
    public void vaixellsDificil()
    {
        numVaixells = 2;
        numIntents = 10;
        numLlancha = 1;
        numVaixell = 1;
        tamanyTauler = 11;
        crearTauler();
    }
    public void vaixellsPersonalitzat()
    {
        crearTauler();
    }
    public void actualitzarTauler()
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
    public void colocarBarcosIA(String tipo, int cantidad)
    {
        int posVaixellX, posVaixellY;
        switch (tipo)
        {
            case "llancha":
                    posVaixellX = (int)(1+Math.random()*(tamanyTauler));
                    posVaixellY = (int)(1+Math.random()*(tamanyTauler));
                    System.out.println(posVaixellX + " " + posVaixellY);
                break;
            case "vaixell":
                break;
            case "cuirassat":
                break;
            case "portaavions":
                break;
                
        }
    }
    public void tiradaJugador()
    {
        System.out.println("El tauler ha sigut actualitzat, per favor seleccione la seguent jugada:\n1. Efectuar atac\n2. Visualitzar el tauler\n3. Visualitzar estadistiques del joc");
        eleccio = entrada.nextInt();
    }
}
