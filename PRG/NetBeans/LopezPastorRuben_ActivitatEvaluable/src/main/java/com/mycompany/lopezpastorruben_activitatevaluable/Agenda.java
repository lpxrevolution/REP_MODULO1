package com.mycompany.lopezpastorruben_activitatevaluable;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda 
{
    ArrayList<Contacte> cont = new ArrayList();     //Creem el ArrayList en el que almacenarem els Contactes
    
    public boolean afegirContacte(Contacte c)       //Funció per a afegir un contacte nou ||retorna true si ha sigut creat de forma exitosa|| (pasem un objece Contacte)
    {
        if (cont.size()==0) //Si la llista está buida, afegis el Contate
        {
            cont.add(c);    //Afegir el Contacte
            return true;
        }
        else
        {
            for (Contacte con: cont) //for per a recorrer la llista
            {
                if (con.nom.equals(c.nom)) //Si el contacte te el nom del contacte a crear retorna false al no poder crear dos contacte amb el mateix nom
                    return false;
                else
                { 
                    cont.add(c); //Si no s´ha trobar dos contactes iguals, afegis el Contecte nou.
                    return true;
                }
            }
        }
       return false; 
    }
    public boolean eliminarContacte(String n)       //Funció per a eliminar un Contacte ||retorna true si el Conctacte s´ha eliminat de forma exitosa||(pasem el nom del Conctate a borrar)
    {
        for (Contacte con: cont)
        {
            if (con.nom.equals(n)) //Compara els noms dels Contactes amb el nom proporcionat
            {
                cont.remove(con); //Si existeix coincidencia, eliminem el Contacte
                return true;
            }
        }
        return false;
    }
    public boolean existisContacte(String n)        //Funció per a verificar si un Contacte existeix ||retorna true si el Contacte existeix|| (pasem el nom del Contacte a buscar)
    {
        for (Contacte con: cont)
        {
            if (con.nom.equals(n))
            {
                return true;
            }
        }
        return false;
    }
    public void llistarContactes()                  //Funció per a imprimir per pantalla la llista completa de Contactes
    {
        for (Contacte con: cont)
        {
            if (con instanceof ContactePersona)
                System.out.println("Nom del contacte:" +con.nom + " Teléfon: "+con.telefon + " Anniversari: "+((ContactePersona) con).aniversari);
            else
                System.out.println("Nom del contacte:" +con.nom + " Teléfon: "+con.telefon + " WEB: "+((ContacteEmpresa) con).web);
        }
    }
    public int buscaContacte(String n)              //Funció per a buscar un Contacte a la llista (retorna un INT amb la posició del Contacte a la llista)
    {
        for(int i=0; i<cont.size();i++) //for per a recorrer la llista tenint i com a posició absoluta
        {
            if (cont.get(i).nom.equals(n))
            {
                return i+1; //Si trobem coincidencia, retornem la posició abosuluta+1 (doncs la posició de la llista comensa per 0 y es mes fácil de entendre per al usuari que comense per 1)
            }
        }
        return 0; //Retornem 0 si el Conctacte no ha sigut trobat a la llista 
    }
}