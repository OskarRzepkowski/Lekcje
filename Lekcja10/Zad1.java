package com.company;


public class Zad1
{
    public static void main(String[] args)
    {
        Trójkąt trójkąt = new Trójkąt(4, 4, 12, 4);

        Prostokąt prostokąt = new Prostokąt(4, 12);

        Kwadrat kwadrat = new Kwadrat(12);



        System.out.println("Pole trójkąta wynosi: ");
        trójkąt.obliczPole();
        System.out.println("Obwód trójkąta wynosi: ");
        trójkąt.obliczObwod();



        System.out.println();
        System.out.println("Pole porstokąta wynosi: ");
        prostokąt.obliczPole();
        System.out.println("Obwód prostokąta wynosi: ");
        prostokąt.obliczObwod();
        


        System.out.println();

        System.out.println("Pole kwadratu wynosi: ");
        kwadrat.obliczPole();
        System.out.println("Obwód kwadratu wynosi: ");
        kwadrat.obliczObwod();
    }
}
