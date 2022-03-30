package com.mycompany.lopezpastorruben_activitatevaluable;

public class ContacteEmpresa extends Contacte
{
    String web;
    public ContacteEmpresa(String nm, int tlf, String paginaw) //Constructor Conctacte + ContacteEmpresa
    {
        super(nm,tlf);
        web=paginaw;
    }
}
