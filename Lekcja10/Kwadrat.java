package com.company;

public class Kwadrat implements Figura {
    int bok;

    public Kwadrat(int bok)
    {
        this.bok = bok;
    }

    @Override
    public void obliczPole()
    {
        System.out.println(bok * bok);
    }

    @Override
    public void obliczObwod()
    {
        System.out.println(bok * 4);
    }
}
