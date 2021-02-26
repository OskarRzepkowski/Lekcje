package com.company;

import java.lang.Math.*;

public class Punkcik
{
   public int x;
   public int y;

    public Punkcik() //konstruktor
    {
        x=0;
        y=0;
    }

    public Punkcik(int q, int p) //konstruktor 2
    {
        x=q;
        y=p;
    }

    public double odleglosc(int x2, int y2)
    {
        return Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));
    }

    public double odleglosc2(Punkcik UwU)
    {
        return Math.sqrt(Math.pow(UwU.x-x,2)+Math.pow(UwU.y-y,2));
    }
}
