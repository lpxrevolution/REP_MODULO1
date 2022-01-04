package enfonalaflota;

import java.util.Scanner;

public class EnfonaLaFlota 
{
    static int opcioElegida, tamanyTauler, numVaixellsIA, numIntents, numLlanxa, numVaixell, numCuirassat, numPortaavions; //Creem les variables int que anem a necesitar
    static Scanner entrada = new Scanner(System.in); //Creem la variable Scanner per a la entrada de dades per part del usuari
    
    public static void main(String[] args)//Funcio Main
    {
        String[][] taulerUI; //Matriu del tauler que visualitza el jugador
        String[][] taulerIA; //Matriu de la máquina
        opcioElegida = entradaConsola("Benvingut a Anfonar la Flota.\nElija la dificultad del joc:\n1.Fácil.\n2.Mitjà.\n3.Difícil.\n4.Personalitzat\n5.Eixir"); //Mostra el menú principal del joc y almacena la opció elegida per el usuari en la variable
        eleccioColocarVaixells(opcioElegida); //Cridem la funcio "eleccioColocarVaixells" pasantli el valor opcioElegida
        taulerUI = new String[tamanyTauler][tamanyTauler]; //Creem la matriu del usuari amb els tamany en els eixos X i Y de tamanyTauler
        taulerIA = new String[tamanyTauler][tamanyTauler]; //Creem la matriu de la IA amb els tamany en els eixos X i Y de tamanyTauler
        crearTauler(tamanyTauler, taulerIA); //Plenem la matriu del usuari
        crearTauler(tamanyTauler, taulerUI); //Plenem la matriu de la IA   
        mostrarTauler(taulerUI); //Mostrem al usuari la matriu UI
        posicionarVaixellsIA(taulerIA); //Cricem la funció per a crear els vaixells (pasem el tauler on posicionem els vaixells)
        while (numVaixellsIA>0) //Mentre la IA tinga una casella amb algun vaixell estarem en aquest bucle
            tiradaJugador(numVaixellsIA, taulerUI, taulerIA); //La variable se iguala al resultat retornat per le funció (pasem el numero de vaixells que te la IA, el tauler del usuari i el tauler de la IA)
        System.out.println("Has afonat tots els vaixells de la IA.\nEnhorabona!");
    }
    public static int entradaConsola(String text) //Funció per a mostrar un mensatje en pantalla y capturar la entrada del usuari (mensaje que es motrará)
    {
        System.out.println(text); //Imprimim en pantalla el text de la varible
        return entrada.nextInt(); //Retotnem el valor int que el usuari introdueix per teclat
    }
    public static int nombreAleatori(int min, int max) //Funció per a generar un numbre aleatori comprengut entre dos nombres (nombre mínim, nombre máxim)
    {
        return (int) Math.round((Math.random()*(max-min)+1));
    }
    public static void eleccioColocarVaixells(int i)//Funcio que envia per un camí o altre en funció de la opció elegida en el menú (opció elegida)
    {
            switch(i)
            {
                case 1:
                    System.out.println("Ha elegit joc fácil");
                    vaixells("F"); //Criem la funció pasantli el String corresponent a la opcio fácil
                    break;
                case 2:
                    System.out.println("Ha elegit joc mitgá");
                    vaixells("M"); //Criem la funció pasantli el String corresponent a la opcio mitgá
                    break;
                case 3:
                    System.out.println("Ha elegit joc difícil");
                    vaixells("D"); //Criem la funció pasantli el String corresponent a la opcio difícil
                    break;
                case 4:
                    System.out.println("Ha elegit joc personalitzat");
                    crearPartidaPerso(); //Cridem la funció per a crear la partida personalitzada
                    break;
                case 5:
                    System.exit(0); //Eixim del programa
                default: //Si el usuari no introdueix una dada correcta pasarem per açí
                    System.out.println("Elecció incorrecta, torna a intentar");
                    i = entradaConsola("Benvingut a Anfonar la Flota.\nElija la dificultad del joc:\n1.Fácil.\n2.Mitjà.\n3.Difícil.\n4.Personalitzat");
                    eleccioColocarVaixells(i); //Tornem a demanar la opció al usuari al introduir una dada incorrecta
                    break;
            }
    }
    public static void crearPartidaPerso()//Demana dades al usuari per a crear la partida personalitzada, dins de un llimits aceptables.
    {
        boolean intents = true;
        tamanyTauler = (entradaConsola("Escriu el tamany del tauler(nombre entre 4 y 10):"))+1;
        if (tamanyTauler<4||tamanyTauler>9)//Asegurem que el usuari cree un tauler dins dels llimits establits
        {
            System.out.println("El tamany del tauler está fora dels llimits");
        }
        numLlanxa = entradaConsola("Escriu la cantitat de Llanxes:");           //demanem al usuari les dades del vaixells
        numVaixell = entradaConsola("Escriu la cantitat de Vaixells:");         //
        numCuirassat = entradaConsola("Escriu la cantitat de Cuirassats:");     //
        numPortaavions = entradaConsola("Escriu la cantitat de Portaavions:");  //
        numVaixellsIA = numLlanxa+numVaixell*3+numCuirassat*4+numPortaavions*5; //Calculem les caselles totals ocupades per els vaixells
        if (numVaixellsIA>((tamanyTauler*tamanyTauler)*.6)) //Asegurem que les vaixell no ocupen mes del 60% del tauler
        {
            System.out.println("Has creat molt vaixells per al tauler elegit. (Els vaixells no deuen ocupar mes del 60% del tauler)");
            crearPartidaPerso();
        }
        else if (numVaixellsIA<((tamanyTauler*tamanyTauler)*.15)) ////Asegurem que les vaixell no ocupen menys del 15% del tauler
        {
            System.out.println("Has creat pocs vaixells per al tauler elegit. (Els vaixells deuen ocupar mes del 15% del tauler)");
            crearPartidaPerso();
        }
        while (intents) //Bucle del cuál sols eixim cuant se introdueixca un valor per a "intents" valit
        {
            numIntents = entradaConsola("Escriu la cantitat intents: (entre "+(Math.round(numVaixellsIA/2))+" y "+(Math.round((tamanyTauler*tamanyTauler)*.6-1))+")");
            if (numIntents>=((tamanyTauler*tamanyTauler)*.6))//Calculem que el numero de intents no sobrepase el 60% de les caselles del tauler
            {
                System.out.println("El nombre de intents no pot ser tan alt, sería masa fácil");
            }
            else if (numIntents<=((tamanyTauler*tamanyTauler)*.05))//Calculem que el numero de intents supere el 5% de les caselles del tauler
            {
                System.out.println("El nombre de intents no pot ser tan baig, sería masa difícil");
            }
            else if (numIntents<Math.round(numVaixellsIA/2))//Calculem que el numero de intents supere el nombre de les caselles ocupades per el Vaixells en el tauler
                System.out.println("El nombre de intents no pot ser mai mes baix del 50% del nombre de caselles que ocupen els vaixells");
            else
                intents=false;
        }
    }
    public static void vaixells(String opcio) //Funció que guardará les opcions de la partida
    {
        switch (opcio)
        {
            case "F": //Dades per a la partida "fácil"
                numIntents = 50;
                numLlanxa = 5;
                numVaixell = 3;
                numCuirassat = 1;
                numPortaavions = 1;
                tamanyTauler = 11;
                numVaixellsIA = numLlanxa+numVaixell*3+numCuirassat*4+numPortaavions*5; //Calculem les caselles totals ocupades per els vaixells
                break;
            case "M": //Dades per a la partida "mitgá"
                numIntents = 30;
                numLlanxa = 2;
                numVaixell = 1;
                numCuirassat = 1;
                numPortaavions = 1;
                tamanyTauler = 11;
                numVaixellsIA = numLlanxa+numVaixell*3+numCuirassat*4+numPortaavions*5;
                break;
            case "D": //Dades per a la partida "difícil"
                numIntents = 10;
                numLlanxa = 1;
                numVaixell = 1;
                tamanyTauler = 11;
                numVaixellsIA = numLlanxa+numVaixell*3+numCuirassat*4+numPortaavions*5;
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
        String[] vectorABC = {" ","A","B","C","D","E","F","G","H","I","J"}; //Vector en el que almacenem les lletres del Abecedari per a colocarles a la matriu
        for (int y = 0;y<tamanyTauler;y++) //Crea el tauler elegit amb el tamany que hem pasat a la funció
        {
            for (int x = 0;x<tamanyTauler;x++)
            {
                if(y==0)
               {
                    if (x>0) //En les posicions 0 del eix X colocarem les lletres almacenades en el vector tauler
                    {
                        tauler[y][x] = String.valueOf(x-1);
                    }
                    else //En la posició 0-0 deixem buida (canto superior esquerre on no deu de haber res)
                    {
                        tauler[y][x] = " ";
                    }
                }
                else //
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
        int posicioVaixellY=0; //Posiccio Y en la que es creará en vaixell
        int posicioVaixellX=0; //Posiccio X en la que es creará en vaixell
        int intentsCreacio = 0; //Cantitat de intents al crear un vaixell
                
        crearLlanxa(posicioVaixellY, posicioVaixellX, intentsCreacio, taulerIA);        //Cridem les funcions que crearan cada tipus de vaixell
        crearVaixell(posicioVaixellY, posicioVaixellX, intentsCreacio, taulerIA);       //
        crearCuirassat(posicioVaixellY, posicioVaixellX, intentsCreacio, taulerIA);     //
        crearPortavions(posicioVaixellY, posicioVaixellX, intentsCreacio, taulerIA);    //
        
                mostrarTauler(taulerIA);
    }
    public static void crearLlanxa(int posicioVaixellY, int posicioVaixellX, int intentsCreacio, String taulerIA[][])//Funció que crea les Llanxes al tauler
    {
        
        for (int i=numLlanxa; i>0; i--)//Creem les Llanches com son 1x1 no elegim entre horitzontal o vertial
        {
            posicioVaixellY = nombreAleatori(1,tamanyTauler-1); //crea una coordenada YX aleatoria dins del tauler 
            posicioVaixellX = nombreAleatori(1,tamanyTauler-1); //
            if (taulerIA[posicioVaixellY][posicioVaixellX] == "-")
            {
                taulerIA[posicioVaixellY][posicioVaixellX] = "L";
                intentsCreacio = 0; //Com hem conseguir posicionar el vaixell, resetegem el contaor de intents de creació.
            }
            else
            {
                intentsCreacio++; //Si no hem pogut crear el vaixell sumem 1 als intents de crearlo
                i++; //Com no hem pogut posicionar el vaixell sumem 1 a i per a que no conte com a vaixell creat en el bucle.
                if (intentsCreacio==50) //Si hem intentat 50 vegades posicionar el vaicell y no hem pogut, el programa ens mostrara un misatge i eixira del programa
                {
                    System.out.println("No es pot posicionar mes vaixells al tauler.\nEixint de la partida.");
                    System.exit(0);
                }
            }
        }
    }
    public static void crearVaixell(int posicioVaixellY, int posicioVaixellX, int intentsCreacio, String taulerIA[][])//Funció que crea els Vaixells al tauler
    {
        for (int i=numVaixell; i>0;i--)
        {
            int vertiHoritz = nombreAleatori(0,1); //Nombre aleatori entre 0 i 1 que utilitzarem per a decidir si posicionem el vaixell en vertical o horitzontal
            int vaixellColocat = 0; //Variable que utiliztarem per a que una vegada deicidit que el vaixell es creara con vertical no pare de intentar colocarlo fins que o, heu consegisca o pase la cantitat de intents maxima
            if(vertiHoritz>0)
            {
                while (vaixellColocat==0)
                {   
                    posicioVaixellY = nombreAleatori(3,tamanyTauler-1);
                    posicioVaixellX = nombreAleatori(1,tamanyTauler-1);
                    if ((taulerIA[posicioVaixellY][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY+1][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY+2][posicioVaixellX]) == "-") //Ens asegurem que les coordenades que va a ocupar el vaixell estiguen disponibles
                    {
                        taulerIA[posicioVaixellY][posicioVaixellX]="B";
                        taulerIA[posicioVaixellY+1][posicioVaixellX]="B";
                        taulerIA[posicioVaixellY+2][posicioVaixellX]="B";
                        intentsCreacio=0;
                        vaixellColocat=1;
                    }
                    else
                        numVaixell++;
                        intentsCreacio++;
                        if (intentsCreacio==50)
                    {
                        System.out.println("No es pot posicionar mes vaixells al tauler");
                        System.exit(0);
                    }
                }
            }
            else
            {
                while (vaixellColocat==0)
                {  
                    posicioVaixellY = nombreAleatori(1,tamanyTauler-1);
                    posicioVaixellX = nombreAleatori(3,tamanyTauler-1);
                    if ((taulerIA[posicioVaixellY][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY][posicioVaixellX+1]=="-")&&(taulerIA[posicioVaixellY][posicioVaixellX+2]) == "-")
                    {
                        taulerIA[posicioVaixellY][posicioVaixellX]="B";
                        taulerIA[posicioVaixellY][posicioVaixellX+1]="B";
                        taulerIA[posicioVaixellY][posicioVaixellX+2]="B";
                        intentsCreacio=0;
                        vaixellColocat=1;
                    }
                    else
                        numVaixell++;
                        intentsCreacio++;
                        if (intentsCreacio==50)
                    {
                        System.out.println("No es pot posicionar mes vaixells al tauler");
                        System.exit(0);
                    }
                }
            }
        }
    }
    public static void crearCuirassat(int posicioVaixellY, int posicioVaixellX, int intentsCreacio, String taulerIA[][])//Funció que crea els Cuirassats al tauler
    {
        for (int i=numCuirassat; i>0;i--)
        {
            int vertiHoritz = nombreAleatori(0,1);
            int vaixellColocat = 0;
            if(vertiHoritz>0)
            {
                while (vaixellColocat==0)
                {   
                    posicioVaixellY = nombreAleatori(4,tamanyTauler-1);
                    posicioVaixellX = nombreAleatori(1,tamanyTauler-1);
                    if ((taulerIA[posicioVaixellY][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY+1][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY+2][posicioVaixellX]) == "-"&&(taulerIA[posicioVaixellY+3][posicioVaixellX]=="-"))
                    {
                        taulerIA[posicioVaixellY][posicioVaixellX]="Z";
                        taulerIA[posicioVaixellY+1][posicioVaixellX]="Z";
                        taulerIA[posicioVaixellY+2][posicioVaixellX]="Z";
                        taulerIA[posicioVaixellY+3][posicioVaixellX]="Z";
                        intentsCreacio=0;
                        vaixellColocat=1;
                    }
                    else
                    {
                        numCuirassat++;
                        intentsCreacio++;
                    }
                        if (intentsCreacio==50)
                    {
                        System.out.println("No es pot posicionar mes vaixells al tauler");
                        System.exit(0);
                    }
                }
            }
            else
            {
                while (vaixellColocat==0)
                {   
                    posicioVaixellY = nombreAleatori(1,tamanyTauler-1);
                    posicioVaixellX = nombreAleatori(4,tamanyTauler-1);
                    if ((taulerIA[posicioVaixellY][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY][posicioVaixellX+1]=="-")&&(taulerIA[posicioVaixellY][posicioVaixellX+2]) == "-"&&(taulerIA[posicioVaixellY][posicioVaixellX+3]=="-"))
                    {
                        taulerIA[posicioVaixellY][posicioVaixellX]="Z";
                        taulerIA[posicioVaixellY][posicioVaixellX+1]="Z";
                        taulerIA[posicioVaixellY][posicioVaixellX+2]="Z";
                        taulerIA[posicioVaixellY][posicioVaixellX+3]="Z";
                        intentsCreacio=0;
                        vaixellColocat=1;
                    }
                    else
                    {
                        numCuirassat++;
                        intentsCreacio++;
                    }
                        if (intentsCreacio==50)
                    {
                        System.out.println("No es pot posicionar mes vaixells al tauler");
                        System.exit(0);
                    }
                }
            }
        }
    }
    public static void crearPortavions(int posicioVaixellY, int posicioVaixellX, int intentsCreacio, String taulerIA[][])//Funció que crea els Portaavions al tauler
    {
        for (int i=numPortaavions; i>0;i--)
        {
            int vertiHoritz = nombreAleatori(0,1);
            int vaixellColocat = 0;
            if(vertiHoritz>0)
            {
                while (vaixellColocat==0)
                {   
                    posicioVaixellY = nombreAleatori(5,tamanyTauler-1);
                    posicioVaixellX = nombreAleatori(1,tamanyTauler-1);
                    if ((taulerIA[posicioVaixellY][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY+1][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY+2][posicioVaixellX]) == "-"&&(taulerIA[posicioVaixellY+3][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY+4][posicioVaixellX]=="-"))
                    {
                        taulerIA[posicioVaixellY][posicioVaixellX]="P";
                        taulerIA[posicioVaixellY+1][posicioVaixellX]="P";
                        taulerIA[posicioVaixellY+2][posicioVaixellX]="P";
                        taulerIA[posicioVaixellY+3][posicioVaixellX]="P";
                        taulerIA[posicioVaixellY+4][posicioVaixellX]="P";
                        intentsCreacio=0;
                        vaixellColocat=1;
                    }
                    else
                    {
                        numPortaavions++;
                        intentsCreacio++;
                    }
                        if (intentsCreacio==50)
                    {
                        System.out.println("No es pot posicionar mes vaixells al tauler");
                        System.exit(0);
                    }
                }
            }
            else
            {
                while (vaixellColocat==0)
                {   
                    posicioVaixellY = nombreAleatori(1,tamanyTauler-1);
                    posicioVaixellX = nombreAleatori(5,tamanyTauler-1);
                    if ((taulerIA[posicioVaixellY][posicioVaixellX]=="-")&&(taulerIA[posicioVaixellY][posicioVaixellX+1]=="-")&&(taulerIA[posicioVaixellY][posicioVaixellX+2]) == "-"&&(taulerIA[posicioVaixellY][posicioVaixellX+3]=="-")&&(taulerIA[posicioVaixellY][posicioVaixellX+4]=="-"))
                    {
                        taulerIA[posicioVaixellY][posicioVaixellX]="P";
                        taulerIA[posicioVaixellY][posicioVaixellX+1]="P";
                        taulerIA[posicioVaixellY][posicioVaixellX+2]="P";
                        taulerIA[posicioVaixellY][posicioVaixellX+3]="P";
                        taulerIA[posicioVaixellY][posicioVaixellX+4]="P";
                        intentsCreacio=0;
                        vaixellColocat=1;
                    }
                    else
                    {
                        numPortaavions++;
                        intentsCreacio++;
                    }
                        if (intentsCreacio==50)
                    {
                        System.out.println("No es pot posicionar mes vaixells al tauler");
                        System.exit(0);
                    }
                }
            }
        }
    }
    public static int tiradaJugador(int numVaixellsIA, String taulerUI[][], String taulerIA[][]) //Funció amb les opcions que tindrá el jugador en cada tirada
    {
        String coordenada;
        Scanner entrada = new Scanner(System.in);
        opcioElegida = entradaConsola("Queden: "+numIntents +" Intents"+"\nQueden: "+numVaixellsIA+" Caselles de vaixells"+"\nEl tauler ha sigut actualitzat, per favor seleccione la seguent jugada:\n1. Efectuar atac\n2. Visualitzar el tauler\n3. Visualitzar estadistiques del joc\n4. Eixir de la partida.");
        switch (opcioElegida)
        {
            case 1:
                System.out.println("Introdueix les coordenades per al atac: (Lletra en mayúscula)");
                coordenada = entrada.nextLine(); //Almacenem les coordenades introduïdes per el usuari
                comprobarCoordenada(coordenada, taulerIA, taulerUI); //Cridem la funció i li pasem les coordenades
                if (numIntents == 0)
                    System.out.println("Has esgotat els intents y no has afonat els vaixells.\nHas perdut!");                    
                break;
            case 2:
                mostrarTauler(taulerUI);
                mostrarTauler(taulerIA);
                break;
            case 3:
                break;
            case 4:
                System.exit(0);
                break;
        }
        return numVaixellsIA;
    }
    public static void comprobarCoordenada(String coor, String taulerIA[][], String taulerUI[][])
    {
        int coorY = 0; //Almacenem les coordenades Y i X
        int coorX = 0; //
        for (int i = 1; i<tamanyTauler;i++) //Busquem amb el primer digit introduït per el usuari
        {
            
            if (coor.charAt(0) == taulerIA[i][0].charAt(0))
                coorY = i;
            else if (coor.charAt(0) == taulerIA[0][i].charAt(0))//Aques "else if" ens permet que el usuari puga posar les coordenades desitjades en cualsevol ordre, ej. A8 o 8A
                coorX = i;
        }
       for (int i = 0; i<tamanyTauler;i++) //Busquem amb el segon digit introduït per el usuari
        {
            if (coor.charAt(1) == taulerIA[0][i].charAt(0))
                coorX = i;
            else if (coor.charAt(1) == taulerIA[i][0].charAt(0))
                coorY = i;
        }
       if (coorY!=0&&coorX!=0)
           atac(coorY, coorX, taulerIA, taulerUI);
    }
    public static void atac(int Y, int X, String tauler[][],String taulerUI[][])
    {
        if (tauler[Y][X] == "-")
        {
            System.out.println("Has fallat, el tir ha caigut al aigüa");
            tauler[Y][X] = "A";
            taulerUI[Y][X] = "A";
            numIntents--;
        }
        else if (tauler[Y][X] == "A"||tauler[Y][X] == "T")
        {
            System.out.println("Ya habíes tirat en aquesta coordenada");
        }
        else
        {
            System.out.println("Bona puntaría!! has donat a un vaixell");
            tauler[Y][X] = "T";
            taulerUI[Y][X] = "T";
            numVaixellsIA --;
        }
    }
}