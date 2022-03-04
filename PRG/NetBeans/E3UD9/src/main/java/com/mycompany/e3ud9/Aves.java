package com.mycompany.e3ud9;

/**
 *
 * @author rbnre
 */
public abstract class Aves extends Mascotas 
{
    boolean pico;
    boolean vuela;
    
    public Aves(String nom, int e, String est, String fechaNac, boolean pic, boolean vuel)
    {
        super(nom, e, est, fechaNac);
        pico = pic;
        vuela = vuel;
    }
    
    abstract void volar();
}
