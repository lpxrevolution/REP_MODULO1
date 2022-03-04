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
        Iterator it = inventario.iterator();
        inventario.add(new perro("Curro", 8, "Bueno", "010101", "Bulldog", true));
        inventario.add(new Gato("Patitas", 2, "Bueno", "010116", "Comun", false));
        inventario.add(new perro("Box", 3, "Demacrado", "010115", "Bocer", false));
        inventario.add(new Gato("Odin", 10, "Perfecto", "010112", "Persa", true));
        seleccionMenu(mostrarMenu("Elige una opción: "
                                + "\n1. Mostrar las Mascotas del Inventario."
                                + "\n2. Mostrar los datos de un animal concreto"
                                + "\n3. Mostrar edades."), inventario, it);
        
    }
    public static void seleccionMenu(int opcion, ArrayList inventario,Iterator it)
    {
        switch (opcion)
        {
            case 1:
                mostrarInventario(inventario, it);
                break;
            case 2:
                mostrarAnimal(mostrarMenuTxt("Indique a continuacion el nombre del animal del que desee la informacion:"), inventario, it);
                break;
            case 3:
                mostrarEdad(mostrarMenu("Elige las edad de que animal quieres:\n1.Perro.\n2.Gato.\n3.Loro.\n4.Canario."), inventario, it);
                break;
            case 4:
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
    public static String mostrarMenuTxt(String mensaje)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        String in = sc.nextLine();
        return in;
    }
    public static void mostrarMensaje(String mensaje)
    {
        System.out.println(mensaje);
    }
    public static void mostrarInventario(ArrayList lista,Iterator it)
    {
        if (lista.size() == 0)
            {
                mostrarMensaje("El inventario está vacío");
            }
        else
        {
            int i = 0;
            for (it = lista.iterator(); it.hasNext();)
            {
                Mascotas m = (Mascotas)it.next();
                if (m instanceof perro)
                    System.out.print("El animal en la posicion " + i + " es un perro, se llama ");
                else if(m instanceof Gato)
                    System.out.print("El animal en la posicion " + i + " es un gato, se llama ");
                else if(m instanceof Loro)
                    System.out.print("El animal en la posicion " + i + " es un Loro, se llama ");
                else if (m instanceof Canario)
                    System.out.print("El animal en la posicion " + i + " es un Canario, se llama ");
                System.out.println(m.nombre + " y tiene " + m.edad + " años.");
                i++;
            }
        }
    }
    public static void mostrarEdad(int opcion,ArrayList inventario, Iterator it)
    {
        int i = 0;
        Mascotas m;
        for (it = inventario.iterator(); it.hasNext();)
            {
                m = (Mascotas)it.next();
                switch (opcion)
                {
                    case 1:
                        if (m instanceof perro)
                        {
                            System.out.println("En la posicion "+i + " hay un perro y su edad es: "+ m.edad);
                        }
                        break;
                    case 2:
                        if (m instanceof Gato)
                        {
                            System.out.println("En la posicion "+i + " hay un gato y su edad es: "+ m.edad);
                        }
                        break;
                    case 3:
                        if (m instanceof Loro)
                        {
                            System.out.println("En la posicion "+i + " hay un loro");
                        }
                        break;
                    case 4:
                        if (m instanceof Canario)
                        {
                            System.out.println("En la posicion "+i + " hay un canario");
                        }
                        break;
                    default:
                        break;
                }
                i++;
            }
    }
    public static void mostrarAnimal(String nombre, ArrayList lista, Iterator it)
    {   
        Mascotas m;
        int i =1;
        for (it = lista.iterator(); it.hasNext();)
        {
            m = (Mascotas)it.next();
            if (m.nombre.equals(nombre))
            {
                if (m instanceof perro)
                    System.out.println("Se ha encontrado el animal:"
                                    +"\nNombre: "+m.nombre
                                    +"\nEdad: "+m.edad
                                    +"\nEstado: "+m.estado
                                    +"\nFecha de Nacimiento: "+m.fechaNacimiento
                                    +"\nRaza: "+((perro) m).raza
                                    +"\nTiene Pulgas: "+((perro) m).pulgas);
                else if (m instanceof Gato)
                    System.out.println("Se ha encontrado el animal:"
                                    +"\nNombre: "+m.nombre
                                    +"\nEdad: "+m.edad
                                    +"\nEstado: "+m.estado
                                    +"\nFecha de Nacimiento: "+m.fechaNacimiento
                                    +"\nColor: "+((Gato) m).color
                                    +"\nPelo Largo: "+((Gato) m).peloLargo);
                else if (m instanceof Loro)
                    System.out.println("Se ha encontrado el animal:"
                                    +"\nNombre: "+m.nombre
                                    +"\nEdad: "+m.edad
                                    +"\nEstado: "+m.estado
                                    +"\nFecha de Nacimiento: "+m.fechaNacimiento
                                    +"\nOrgien: "+((Loro) m).origen
                                    +"\nHabla: "+((Loro) m).habla);
                else if (m instanceof Canario)
                    System.out.println("Se ha encontrado el animal:"
                                    +"\nNombre: "+m.nombre
                                    +"\nEdad: "+m.edad
                                    +"\nEstado: "+m.estado
                                    +"\nFecha de Nacimiento: "+m.fechaNacimiento
                                    +"\nColor: "+((Canario) m).color
                                    +"\nCanta: "+((Canario) m).canta);
            }
            else if (i==lista.size())
                System.out.println("No se ha encontrado el animal buscado.");
        i++;
        }
    }
}
