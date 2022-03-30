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
                                + "\n3. Mostrar todos los animales."), inventario, it);
        
    }
    public static int mostrarMenu(String mensaje)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int in = sc.nextInt();
        return in;
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
                mostrarDatos(inventario, it);
                break;
            case 4:
                anadirAnimal(mostrarMenuTxt("Indique que especie quiere añadir al inventario"), inventario, it);
                break;
            default:
                System.out.println("Ninguna opción valida elegida, vuelva a intentarlo.");
                break;
                        
        }
    }
    public static String mostrarMenuTxt(String mensaje)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        String in = sc.nextLine();
        return in;
    }
    public static boolean mostrarMenuBool(String mensaje)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        boolean in = sc.nextBoolean();
        return in;
    }
    public static int mostrarMenuInt(String mensaje)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int in = sc.nextInt();
        return in;
    }     
    public static void mostrarInventario(ArrayList lista,Iterator it)
    {
        if (lista.size() == 0)
            {
                System.out.println("El inventario está vacío");
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
    public static void mostrarDatos(ArrayList inventario, Iterator it)
    {
        int i = 0;
        Mascotas m;
        for (it = inventario.iterator(); it.hasNext();)
            {
                m = (Mascotas)it.next();
                 if (m instanceof perro)
                    imprimirXAnimal("perro", m);
                else if (m instanceof Gato)
                    imprimirXAnimal("gato", m);
                else if (m instanceof Loro)
                    imprimirXAnimal("loro",m);
                else if (m instanceof Canario)
                    imprimirXAnimal("canario", m);  
                i++;
            }
    }
    public static void imprimirXAnimal(String animal, Mascotas m)
    {
        switch(animal)
        {
            case "perro":
                System.out.println("Se ha encontrado el animal de la especie Perro:"
                                    +"\nNombre: "+m.nombre
                                    +"\nEdad: "+m.edad
                                    +"\nEstado: "+m.estado
                                    +"\nFecha de Nacimiento: "+m.fechaNacimiento
                                    +"\nRaza: "+((perro) m).raza
                                    +"\nTiene Pulgas: "+((perro) m).pulgas);
                break;
            case "gato":
                System.out.println("Se ha encontrado el animal de la especie Gato:"
                                    +"\nNombre: "+m.nombre
                                    +"\nEdad: "+m.edad
                                    +"\nEstado: "+m.estado
                                    +"\nFecha de Nacimiento: "+m.fechaNacimiento
                                    +"\nColor: "+((Gato) m).color
                                    +"\nPelo Largo: "+((Gato) m).peloLargo);
                break;
            case "loro":
                System.out.println("Se ha encontrado el animal de la especie Loro:"
                                    +"\nNombre: "+m.nombre
                                    +"\nEdad: "+m.edad
                                    +"\nEstado: "+m.estado
                                    +"\nFecha de Nacimiento: "+m.fechaNacimiento
                                    +"\nOrgien: "+((Loro) m).origen
                                    +"\nHabla: "+((Loro) m).habla);
                break;
            case "canario":
                System.out.println("Se ha encontrado el animal de la especie Canario:"
                                    +"\nNombre: "+m.nombre
                                    +"\nEdad: "+m.edad
                                    +"\nEstado: "+m.estado
                                    +"\nFecha de Nacimiento: "+m.fechaNacimiento
                                    +"\nColor: "+((Canario) m).color
                                    +"\nCanta: "+((Canario) m).canta);
                break;
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
                    imprimirXAnimal("perro", m);
                else if (m instanceof Gato)
                    imprimirXAnimal("gato", m);
                else if (m instanceof Loro)
                    imprimirXAnimal("loro",m);
                else if (m instanceof Canario)
                    imprimirXAnimal("canario", m);
            }
            else if (i==lista.size())
                System.out.println("No se ha encontrado el animal buscado.");
        i++;
        }
    }
    public static void anadirAnimal(String animal, ArrayList lista, Iterator it)
    {
        Mascotas m;
        switch(animal)
        {
            case "perro":
                lista.add(new perro(mostrarMenuTxt("Indique el nombre del perro:"), 
                                    mostrarMenuInt("Indique la edad del perro:"),
                                    "", "", "", true));
                break;
            case "gato":
                System.out.println("Se ha encontrado el animal de la especie Gato:");
                break;
            case "loro":
                System.out.println("Se ha encontrado el animal de la especie Loro:");
                break;
            case "canario":
                System.out.println("Se ha encontrado el animal de la especie Canario:");
                break;
        }
    }
}