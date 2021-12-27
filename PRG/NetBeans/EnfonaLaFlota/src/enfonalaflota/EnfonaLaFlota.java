
package enfonalaflota;

import java.util.Scanner;


public class EnfonaLaFlota 
{
    static int opcioElegida, tamanyTauler, numVaixellsIA, numIntents, numLlanxa, numVaixell, numCuirassat, numPortaavions;
    
    public static void main(String[] args)
    {
        String[][] taulerUI;
        String[][] taulerIA;
        opcioElegida = demanarDades();
        calculaTauler(opcioElegida);
        taulerUI = new String[tamanyTauler][tamanyTauler];
        taulerIA = new String[tamanyTauler][tamanyTauler];
        eleccioColocarVaixells(opcioElegida);
        crearTauler(tamanyTauler, taulerIA);
        crearTauler(tamanyTauler, taulerUI);
        mostrarTauler(taulerUI);
        posicionarVaixellsIA(taulerIA);
        System.out.println(numLlanxa);
        while (numVaixellsIA>0)
        {
        numVaixellsIA = tiradaJugador(numVaixellsIA);
        }
    }
    public static int entradaConsola(String text) //Funció per a mostrar un mensaje en pantalla y capturar la entrada del usuario (mensaje que es motrará)
    {
        int eleccio;
        Scanner entrada = new Scanner(System.in);
        System.out.println(text);
        eleccio = entrada.nextInt();
        return eleccio;
    }
    public static int nombreAleatori(int min, int max) //Funció per a generar un numbre aleatori comprengut entre dos nombres (nombre mínim, nombre máxim)
    {
        return (int) Math.round((Math.random()*(min-max)+1));
    }
    public static int demanarDades()
    {
        String text = "Benvingut a Anfonar la Flota.\nElija la dificultad del joc:\n1.Fácil.\n2.Mitjà.\n3.Difícil.\n4.Personalitzat";
        return entradaConsola(text);
    }
    public static void calculaTauler(int opcio)
    {
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
    }
    public static void eleccioColocarVaixells(int i)//Funcio que envia per un camí o altre en funció de la opció elegida en el menú (opció elegida)
    {
            switch(i)
            {
                case 1:
                    System.out.println("Ha elegit joc fácil");
                    vaixells("F");
                    break;
                case 2:
                    System.out.println("Ha elegit joc mitgá");
                    vaixells("M");
                    break;
                case 3:
                    System.out.println("Ha elegit joc difícil");
                    vaixells("D");
                    break;
                case 4:
                    System.out.println("Ha elegit joc personalitzat");
                    break;
                default:
                    System.out.println("Elecció incorrecta, torna a intentar");
                    i = demanarDades();
                    eleccioColocarVaixells(i);
                    break;
            }
    }
    public static void vaixells(String opcio) //Funció que guardará les opcions de la partida
    {
        switch (opcio)
        {
            case "F":
                numVaixellsIA = 10;
                numIntents = 50;
                numLlanxa = 5;
                numVaixell = 3;
                numCuirassat = 1;
                numPortaavions = 1;
                break;
            case "M":
                numVaixellsIA = 5;
                numIntents = 30;
                numLlanxa = 2;
                numVaixell = 1;
                numCuirassat = 1;
                numPortaavions = 1;
                break;
            case "D":
                numVaixellsIA = 2;
                numIntents = 10;
                numLlanxa = 1;
                numVaixell = 1;
                break; 
            case "P":
                break;
        }
    }  
    public static void mostrarTauler(String tauler[][]) //Funció per a mostrar el tauler (tauler que vuigam mostrar)
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
    public static void crearTauler(int tamanyTauler, String tauler[][])//Creació del tauler tant de la IA com de la UI (tamany del tauler y matriu del tauler)
    {
        String[] vectorABC = {" ","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"}; //Vector en el que almacenem les lletres del Abecedari per a colocarles a la matriu
        for (int y = 0;y<tamanyTauler;y++)
        {
            for (int x = 0;x<tamanyTauler;x++)
            {
                if(y==0)
               {
                    if (x>0)
                    {
                        tauler[y][x] = String.valueOf(x-1);
                    }
                    else
                    {
                        tauler[y][x] = " ";
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
                }
            }
        }
    }
    public static void posicionarVaixellsIA(String taulerIA[][])//Funció per a colocar els Vaixells de la IA en el tauler
    {   
        int posicioVaixellY; //Posiccio Y en la que es creará en vaixell
        int posicioVaixellX;//Posiccio X en la que es creará en vaixell
        int vertiHoritz; //Variable entre 0 y 1 per a elegir de forma aleatoria si el vaixell es posara en horitzonal o vertial
        int intentsCreacio = 0;
        numLlanxa = 250;
        for (int i=numLlanxa; i>0; i--)//Creem les Llanches com son 1x1 no elegim entre horitzontal o vertial
        {
            posicioVaixellY = nombreAleatori(tamanyTauler-1,1);
            posicioVaixellX = nombreAleatori(tamanyTauler-1,1);
            if (taulerIA[posicioVaixellY][posicioVaixellX] == "-")
            {
                
                taulerIA[posicioVaixellY][posicioVaixellX] = "L";
                System.out.println("He creat una Llancha en "+posicioVaixellY+"-"+posicioVaixellX+" Queden "+i+" Llanches");
                System.out.println(nombreAleatori(0,1));
            }
            else
            {
                System.out.println("En la posició ya existia un vaixell");
                intentsCreacio++;
                i++;
                if (intentsCreacio==50)
                {
                    System.out.println("No es pot posicionar mes vaixells al tauler");
                    intentsCreacio++;
                    if (intentsCreacio==50)
                    {
                        System.out.println("Ha sigut imposible crear els vaixells necesaris per a la partida");
                        System.exit(0);
                    }
                }
            }
            
        }
        for (int i=numVaixell; i>0;i--)
        {
            System.out.println("Queden "+numVaixell+"vaixells");
            vertiHoritz = nombreAleatori(0,1);
            System.out.println(vertiHoritz);
            int vaixellColocat = 0;
            if(vertiHoritz>0)
            {
                while (vaixellColocat==0)
                {
                System.out.println("Vaig a crear el Vaixell");
                posicioVaixellY = nombreAleatori(tamanyTauler-1,4);
                posicioVaixellX = nombreAleatori(tamanyTauler-1,1);
                if ((taulerIA[posicioVaixellY][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY+1][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY+2][posicioVaixellX]) == "-")
                {
                    System.out.println("Cree Vaixell en vertical");
                    taulerIA[posicioVaixellY][posicioVaixellX]="B";
                    taulerIA[posicioVaixellY+1][posicioVaixellX]="B";
                    taulerIA[posicioVaixellY+2][posicioVaixellX]="B";
                    vaixellColocat=1;
                }
                else
                    System.out.println("El lloc está ocupat");
                    numVaixell++;
                }
            }
            else
            {
                System.out.println("No se que pasa");
                posicioVaixellY = nombreAleatori(tamanyTauler-1,1);
                posicioVaixellX = nombreAleatori(tamanyTauler-1,4);
                if ((taulerIA[posicioVaixellY][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY][posicioVaixellX+1]=="-")&&(taulerIA[posicioVaixellY][posicioVaixellX+2]) == "-")
                {
                    System.out.println("Cree Vaixell en horitzontal");
                    taulerIA[posicioVaixellY][posicioVaixellX]="B";
                    taulerIA[posicioVaixellY][posicioVaixellX+1]="B";
                    taulerIA[posicioVaixellY][posicioVaixellX+2]="B";
                }
            }
        }
        actualitzarTauler(tamanyTauler, taulerIA);
    }
    public static void actualitzarTauler(int tamanyTauler, String tauler[][]) //Funció per a actualizar el tauler
    {
        for (int y = 0;y<tamanyTauler;y++)
        {
            for (int x = 0;x<tamanyTauler;x++)
            {
                System.out.printf("%4s",tauler[y][x]);
            }
            System.out.print("\n");
        }
    }
    public static int tiradaJugador(int numVaixellsIA) //Funció amb les opcions que tindrá el jugador en cada tirada
    {
        int eleccio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("El tauler ha sigut actualitzat, per favor seleccione la seguent jugada:\n1. Efectuar atac\n2. Visualitzar el tauler\n3. Visualitzar estadistiques del joc\n4. Eixir de la partida.");
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
            case 4:
                System.exit(0);
                break;
        }
        return numVaixellsIA;
    }
}