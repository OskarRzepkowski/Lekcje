package com.company;

public class Trójkąt implements Figura
{
    int bok_a;
    int bok_b;
    int bok_c;
    double wysokość;

    public Trójkąt(int bok_a, int bok_b, int bok_c, double wysokość)
    {
        this.bok_a = bok_a;
        this.bok_b = bok_b;
        this.bok_c = bok_c;
        this.wysokość = wysokość;
    }

    @Override
    public void obliczPole()
    {
        System.out.println(bok_a * wysokość / 2);
    }

    @Override
    public void obliczObwod()
    {
        System.out.println(bok_a + bok_b + bok_c);
    }
}
