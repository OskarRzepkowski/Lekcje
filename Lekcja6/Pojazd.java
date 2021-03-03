package com.company;

public class Pojazd
{
    Silnik silnik;
    Kolor kolor;
    Rozmiar rozmiar;


    public Pojazd(Silnik silnik, Kolor kolor, Rozmiar rozmiar)
    {
        this.silnik= silnik;
        this.kolor=kolor;
        this.rozmiar=rozmiar;
    }

    @Override
    public String toString()
    {
        return String.format("Silnik: %s | Kolor: %s | Rozmiar: %s", silnik,kolor,rozmiar);
    }
}
