package com.mycompany.e3ud9;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Mascotas> inventario = new ArrayList();
        seleccionMenu(mostrarMenu("Elige una opción: \n1. Mostrar las Mascotas del Inventario."), inventario);
        
    }
    public static void seleccionMenu(int opcion, ArrayList inventario)
    {
        switch (opcion)
        {
            case 1:
                mostrarMensaje("Opción 1 elegida.");
                mostrarInventario(inventario);
                break;
            case 2:
                mostrarMensaje("Opción 2 elegida.");
                mostrarEdad(mostrarMenu("Elige las edad de que animal quieres:\n1.Perro.\n2.Gato.\n3.Loro.\n4.Canario."), inventario);
                break;
            default:
                mostrarMensaje("Ninguna opción valida elegida, vuelva a intentarlo.");
                break;
                        
        }
    }
    public static int mostrarMenu(String mensaje)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int in = sc.nextInt();
        return in;
    }
    public static void mostrarMensaje(String mensaje)
    {
        System.out.println(mensaje);
    }
    public static void mostrarInventario(ArrayList lista)
    {
        Iterator it = lista.iterator();
        if (lista.size() == 0)
            {
                mostrarMensaje("El inventario está vacío");
            }
        else
        {
            for (Iterator it2 = lista.iterator(); it2.hasNext();)
            {
                Mascotas m = (Mascotas)it2.next();
                System.out.println(m.nombre + " " + m.edad);
            }
        }
    }
    public static void mostrarEdad(int opcion,ArrayList inventario)
    {
        switch (opcion)
        {
            case 1:
                break;
        }
    }
}
