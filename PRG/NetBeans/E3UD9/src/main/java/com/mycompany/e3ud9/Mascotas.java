package com.mycompany.e3ud9;

public abstract class Mascotas 
{
   String nombre;
   int edad;
   String estado;
   String fechaNacimiento;
   public Mascotas(String nom, int e, String est, String fechaNac)
   {
       nombre = nom;
       edad = e;
       estado = est;
       fechaNacimiento = fechaNac;
   }
   abstract void muestra();
   abstract void cumpleanyos();
   abstract void morir();
   abstract void habla();
}
