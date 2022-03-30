package com.mycompany.a1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author rbnre
 */
public class Main {
    public static void main(String[] args)
    {
        mostrarMensaje("Indique la ruta de archivos");
        File f = new File (introString());
        if (f.exists())
            mostrarInfoRuta(f);
        else
            System.out.println("La ruta introducida no existe");
    }
    public static void mostrarMensaje(String msg)
    {
        System.out.println(msg);
    }
    public static String introString()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static void mostrarInfoRuta(File f)
    {
        if (f.isFile())
        {
            System.out.println("Nombre del archivo: "+f.getName());
        }
        else
        {
            File[] lista = f.listFiles();
            
            for (int i=0; i<lista.length ; i++)
            {
                if (lista[i].isDirectory())
                    System.out.println("*"+lista[i]);
            }
            for (int i = 0; i<lista.length;i++)
            {
                if (lista[i].isFile())
                    System.out.println("A"+lista[i]);
            }
        }
    }
}