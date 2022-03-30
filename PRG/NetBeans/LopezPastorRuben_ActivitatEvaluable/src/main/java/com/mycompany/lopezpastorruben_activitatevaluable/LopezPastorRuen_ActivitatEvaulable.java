package com.mycompany.lopezpastorruben_activitatevaluable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LopezPastorRuen_ActivitatEvaulable 
{
    static Agenda agenda = new Agenda(); //Objete Agenda, el creem aomb static y fora del main per a que es puga accedir desde cualsevol metode
    public static void main(String[] args) throws Exception 
    {
        mensajePantalla("Benvingut a la seua Agenda."); //Imprimim mensaje en pantalla
        menuPrincipal(); //Cridem la funció del Menú Principal del programa
    }
    public static void mensajePantalla(String msg) //Funció per a imprimir mensaje en pantalla (pasem mensaje que imprimirá)
    {
        System.out.println(msg);
    }
    public static void menuPrincipal() throws Exception //Funció de menú Principal
    {
        mensajePantalla("Seleccione que vol fer:\n"                 //
                    + "1.Afegir un Contacte nou.\n"                 //
                    + "2.Eliminar Conctacte existent.\n"            //
                    + "3.Comprobar existencia de un Contacte.\n"    // Imprimim el menú que el usuari veura.
                    + "4.Llistar Contactes.\n"                      //
                    + "5.Buscar un Contacte.\n"                     //
                    + "6.Eixir del programa.");                     //
        switch(demanaInt()) //Switch amb el INT que retornara la funció demanaInt()
        {
            case 1:
                Contacte contacte = creacioContacte();  //Instanciem un objecte Contacte el cual tindrá com a valors el objecte Conctacte que retorna la funció creacioContacte()
                if(agenda.afegirContacte(contacte))     //Cridem la funció afegirContacte del objecte "agenda"(pasem el contacte) y comprobem si retorna true, que voldrá dir que el contacte s´ha afegit
                    mensajePantalla("El contacte s´ha afegit correctament.");
                else
                    mensajePantalla("El contacte ya existeix, elimine el existent abanç o guarde amb un nom diferent.");
                break;
            case 2:
                mensajePantalla("Indica el nom del contacte per a borrar.");
                if (agenda.eliminarContacte(demanaString()))    //Cridem la funció eliminarContacte (pasem com a String el que rotarnará la funcio demanaString()) y comprobem si retorna true, que voldrá dir que el contacte s´ha eliminat
                    mensajePantalla("El Contacte ha sigut eliminat satisfactoriament.");
                else
                    mensajePantalla("El Contacte no es troba a la Agenda.");
                break;
            case 3:
                mensajePantalla("Indica el nom del contacte per a buscarlo a la Agenda.");
                if (agenda.existisContacte(demanaString()))     //Cridem la funció existisContacte (pasem com a String el que rotarnará la funcio demanaString()) y comprobem si retorna true, que voldrá dir que el contacte existeix
                    mensajePantalla("El conctacte existeix.");
                else
                    mensajePantalla("El contacte no existeix.");
                break;
            case 4:
                agenda.llistarContactes();      //Cridem la funcio llistarContactes() del objecte agenda.
                break;
            case 5:
                mensajePantalla("Indica el nom del conctacte a buscar:");
                int posicio = agenda.buscaContacte(demanaString()); //Instanciem un Int i el igualem a la funció buscaContacte (pasantli el String que retornará la funció demanaString()) ||La funció retorna 0 si no troba el Contacte o la posició si el troba
                if (posicio==0)
                    mensajePantalla("El contacte no existis");
                else
                    mensajePantalla("El contacte es troba a la posicio "+ posicio +" de la agenda.");
                break;
            case 6: //Opció del menú per a que el usuari tanque de forma segura el programa
                System.exit(0);
                break;
            default: //resultat de introduir un valor no esperat
                mensajePantalla("No ha introduït una opció valida.");
                menuPrincipal();
                break;
        }
        menuPrincipal();
    }
    public static int demanaInt() throws Exception //Funció pera capturar una entrada Int per part del usuari ||retoorna aquest Int
    {
        Scanner sc = new Scanner(System.in);
        try              //Try per a capturar les posibles entrades que pugueren causar un error
        {
            return sc.nextInt();
        }
        catch (InputMismatchException e)
        {
            excpecionsError(1);
        }
        excpecionsError(-1);
        return -1; //Posat a que esperem la entrada del usuari y captant els posibles error, aquest return no deuría de ocurrir mai, per lo que si el programa pasa per aquesta línea cridem la funció excpecionsError(pasant el nombre del error -1)
    }
    public static String demanaString() //Funció pera capturar una entrada String per part del usuari ||retoorna aquest String
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static Contacte creacioContacte() throws Exception //Funció per a demanar quin tipus de Contacte desitge crear el usuari
    {
        mensajePantalla("Indica quin tipus de contacte es creará:\n"
                    + "1.Persona\n"
                    + "2.Empresa");
        switch(demanaInt())
        {
            case 1:
                return demanaDadesCreacioPersona(); //Crida funcio de crear el Conctate tipus Persona
            case 2:
                return demanaDadesCreacioEmpresa(); //Crida funcio de crear el Conctate tipus Empresa
        }
        return null;
    }
    public static Contacte demanaDadesCreacioPersona() throws Exception //Funció per a crear el Conctacte tipus Persona
    {
        int tlf = 0;            //
        int ani = 0;            // Creem les dades buides
        String nom = "";        //
        mensajePantalla("Introdueïx el nom del Contacte:");
        nom = demanaString();   //Igualem nom al String que retornará la fucnió demanaString()
        mensajePantalla("Introdueïx el telefon del Contacte:");
        try                     //Try per a capturar les posibles entrades que pugueren causar un error
        {
            tlf = demanaInt();
            mensajePantalla("Introdueïx el aniversari del Contacte (númeric):");
            ani = demanaInt();
        }
        catch (InputMismatchException e)
        {
            excpecionsError(1); //Funció que tracta les excepcions
        }
        ContactePersona contacte = new ContactePersona(nom,tlf,ani);    //Instanciem un objecte tipus Persona, li donem dades y el retornem
        return contacte;                                                //
    }
    public static Contacte demanaDadesCreacioEmpresa() throws Exception
    {
        int tlf = 0;            //
        String web = "";        // Creem les dades buides
        String nom = "";        //
        mensajePantalla("Introdueïx el nom del Contacte:");
        nom = demanaString();   //Igualem nom al String que retornará la fucnió demanaString()
        mensajePantalla("Introdueïx el telefon del Contacte:");
        try                     //Try per a capturar les posibles entrades que pugueren causar un error
        {
            tlf = demanaInt();
            mensajePantalla("Introdueïx la página WEB:");
            web = demanaString();
        }
        catch (InputMismatchException e)
        {
            excpecionsError(1);
        }
        ContacteEmpresa contacte = new ContacteEmpresa(nom,tlf,web);    //Instanciem un objecte tipus Empresa, li donem dades y el retornem
        return contacte;
    }
    public static void excpecionsError(int numerr) throws Exception //Funció que tracta els posibles errors
    {
        switch (numerr)
        {
            case 1:
                mensajePantalla("Error 01.\nLa dada introduïda es incorrecta, es cancela el proces.");
                menuPrincipal();
                break;
            case -1:
                mensajePantalla("Error 99.\nError inesperat, eixint del programa per a evitar corrupció de dades."); //Aquest es un error que es crida quan el programa ha anat per un fil per el que no deuría pasar, es un error crític y tanquem el programa si ocurris.
                System.exit(0);
                break;
        }
    }
}