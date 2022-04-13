package com.mycompany.lopezpastorruben_activitatevaluable;

public class ContactePersona extends Contacte 
{
    int aniversari;
    
    public ContactePersona(String nm, int tlf, int ani) //Constructor Conctacte + ContactePersona
    {
        super(nm,tlf);
        aniversari=ani;
    }
}
