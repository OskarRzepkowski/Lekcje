package com.company;

public class Kwadrat
{
    public int a;

    public Kwadrat(int b)    //konstruktor
    {
        a=b;
    }

    public int obwod ()      //metoda
    {
        return a*4;
    }

    public int pole ()
    {
        return a*a;
    }
}

